package de.uol.app.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Prefs {
    public static String FACULTY_PREF = "facultyIndex";
    public static String SEMESTER_PREF = "semesterIndex";
    public static String SEMESTER_ONGOING_PREF = "semesterOngoingIndex";
    public static String ZWEI_PREF = "zweiIndex";
    public static String LEH_PREF = "lehIndex";


    public static String STATUS_MAP_PREF = "statusMap";

    public static void saveBasicInfo(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(Prefs.FACULTY_PREF, Variables.spinnerFacultyIndex);
        editor.putInt(Prefs.SEMESTER_PREF, Variables.spinnerSemesterIndex);
        editor.putInt(Prefs.SEMESTER_ONGOING_PREF, Variables.spinnerSemesterOngoingIndex);
        editor.putInt(Prefs.ZWEI_PREF, Variables.spinnerZwaiIndex);
        editor.putInt(Prefs.LEH_PREF, Variables.spinnerLehtIndex);

        editor.apply();
    }

    public static void loadBasicInfo(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);

        Variables.spinnerFacultyIndex = sharedPref.getInt(Prefs.FACULTY_PREF, -1);
        Variables.spinnerSemesterIndex = sharedPref.getInt(Prefs.SEMESTER_PREF, -1);
        Variables.spinnerSemesterOngoingIndex = sharedPref.getInt(Prefs.SEMESTER_ONGOING_PREF, -1);
        Variables.spinnerZwaiIndex = sharedPref.getInt(Prefs.ZWEI_PREF, -1);
        Variables.spinnerLehtIndex = sharedPref.getInt(Prefs.LEH_PREF, -1);

    }

    public static void saveStatusMap(Context context, Map<String, String> inputMap) {
        SharedPreferences pSharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        if (pSharedPref != null) {
            JSONObject jsonObject = new JSONObject(inputMap);
            String jsonString = jsonObject.toString();
            SharedPreferences.Editor editor = pSharedPref.edit();
            editor.remove(STATUS_MAP_PREF).commit();
            editor.putString(STATUS_MAP_PREF, jsonString);
            editor.apply();
        }
    }

    public static void deleteStatusMap(Context context) {
        SharedPreferences pSharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        if (pSharedPref != null) {
            SharedPreferences.Editor editor = pSharedPref.edit();
            editor.remove(STATUS_MAP_PREF).apply();
        }
    }

    public static Map<String, String> loadStatusMap(Context context) {
        Map<String, String> outputMap = new HashMap<>();
        SharedPreferences pSharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        try {
            if (pSharedPref != null) {
                String jsonString = pSharedPref.getString(STATUS_MAP_PREF, (new JSONObject()).toString());
                JSONObject jsonObject = new JSONObject(jsonString);
                Iterator<String> keysItr = jsonObject.keys();
                while (keysItr.hasNext()) {
                    String key = keysItr.next();
                    String value = (String) jsonObject.get(key);
                    outputMap.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputMap;
    }

}