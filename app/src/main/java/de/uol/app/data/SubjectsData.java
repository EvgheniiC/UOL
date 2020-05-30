package de.uol.app.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.uol.app.utils.Variables;

public class SubjectsData {
    private List<ModuleModel> infModules, wirtsModules, zwei30Modules, zwei60Modules;
    private List<ArrayList<String>> infRecommend, wirtsRecommen, zwei30Recommend, zwei60Recommend;

    public SubjectsData() {
        initInfModules();
        initInfRecommendation();

        initWirtsModules();
        initWirtsRecommendation();

        initZwei30Modules();
        initZwei30Recommend();

        initZwei60Modules();
        initZwei60Recommend();
    }

    private void initInfModules() {
        infModules = new ArrayList<>();
        infModules.add(new ModuleModel.Builder().setId("inf004").setName("Softwareprojekt").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf005").setName("Softwaretechnik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf006").setName("Softwaretechnik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf007").setName("Informationssysteme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf008").setName("Informationssysteme II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf009").setName("Praktikum Datenbanken").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf010").setName("Rechnernetze").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf012").setName("Betriebssysteme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf014").setName("Praktikum Betriebssysteme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf016").setName("Internet-Technologien").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf017").setName("Interaktive Systeme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf018").setName("Medienverarbeitung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf020").setName("Maschinennahe Programmierung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf021").setName("Praktikum Fortgeschrittene Java-Technologien").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf030").setName("Programmierung, Datenstrukturen und Algorithmen").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf031").setName("Objektorientierte Modellierung und Programmierung").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf200").setName("Grundlagen der Technischen Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf201").setName("Technische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf202").setName("Praktikum Technische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf203").setName("Eingebettete Systeme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf204").setName("Eingebettete Systeme II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf205").setName("Formale Methoden Eingebetteter Systeme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf207").setName("Grundlagen der Elektrotechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf208").setName("Mikrorobotik und Mikrosystemtechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf209").setName("Regelungstechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf400").setName("Theoretische Informatik: Logik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf401").setName("Grundlagen der Theoretische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("inf403").setName("Kryptologie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf405").setName("Algorithmische Graphentheorie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf406").setName("Praktikum Realzeitsysteme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf407").setName("Programmverifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf408").setName("Algorithmen zur Software-Verifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf521").setName("Medizinische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf530").setName("Künstliche Intelligenz").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf540").setName("Anwendungen der KI").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf600").setName("Wirtschaftsinformatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf601").setName("Wirtschaftsinformatik II ").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf603").setName("Planung und Simulation in der Logistik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf608").setName("eBusiness").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf610").setName("Enterprise Architecture Management").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf700").setName("Didaktik der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf800").setName("Proseminar Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf803").setName("Spezielle Themen der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf804").setName("Spezielle Themen der Informatik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf805").setName("Spezielle Themen der Informatik III").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf806").setName("Spezielle Themen der Informatik IV").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf807").setName("Spezielle Themen der Informatik V").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf808").setName("Aktuelle Themen der Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf851").setName("Informatik und Gesellschaft").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf852").setName("IT-Projektmanagement").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf853").setName("Anwendungen der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf854").setName("Anwendungen der Informatik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf855").setName("Anwendungen der Informatik III").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf856").setName("Anwendungen der Informatik IV").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf857").setName("Anwendungen der Informatik V").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("inf900").setName("Projektgruppe").setMark(24).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("mat030").setName("Analysis II a: Integralrechnung einer Variablen und Differentialgleichungen").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("mat200").setName("Algebra I: Ringe und Moduln").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("mat310").setName("Statistik I – Einführung in die Angewandte Statistik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("mat950").setName("Mathematik für Informatik (Diskrete Strukturen)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("mat955").setName("Mathematik für Informatik (Lineare Algebra)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("mat960").setName("Mathematik für Informatik (Analysis)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        infModules.add(new ModuleModel.Builder().setId("mat996").setName("Einführung in die Numerik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("mat997").setName("Einführung in die Stochastik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("pb085").setName("Soft Skills").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("pb216").setName("Forschungsseminar Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.optional).build());
        infModules.add(new ModuleModel.Builder().setId("BAM").setName("Bachelorabschlussmodul").setMark(15).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.mandatory).build());
    }

    private void initInfRecommendation() {
        infRecommend = new ArrayList<>();
        infRecommend.add(new ArrayList<>(Arrays.asList("inf030", "inf031")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf200")));
        infRecommend.add(new ArrayList<>(Arrays.asList("mat950")));
        infRecommend.add(new ArrayList<>(Arrays.asList("mat955")));
        infRecommend.add(new ArrayList<>(Arrays.asList("pb085")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf400")));
        infRecommend.add(new ArrayList<>(Arrays.asList("mat960")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf200", "inf201")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf005")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf030", "inf031", "inf004")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf007")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf800")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf400", "inf401")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf012")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf010")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf200", "inf201", "inf202")));
        infRecommend.add(new ArrayList<>(Arrays.asList("inf851")));
        infRecommend.add(new ArrayList<>(Arrays.asList("pb216")));
    }

    private void initWirtsModules() {
        wirtsModules = new ArrayList<>();

        wirtsModules.add(new ModuleModel.Builder().setId("inf004").setName("Softwareprojekt").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf005").setName("Softwaretechnik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf006").setName("Softwaretechnik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf007").setName("Informationssysteme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf008").setName("Informationssysteme II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-PI", "Wahl-PI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf009").setName("Praktikum Datenbanken").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf010").setName("Rechnernetze").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-PI", "Wahl-PI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf012").setName("Betriebssysteme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-PI", "Wahl-PI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf014").setName("Praktikum Betriebssysteme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf016").setName("Internet-Technologien").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-PI", "Wahl-PI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf017").setName("Interaktive Systeme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf018").setName("Medienverarbeitung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf020").setName("Maschinennahe Programmierung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf021").setName("Praktikum Fortgeschrittene Java-Technologien").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf030").setName("Programmierung, Datenstrukturen und Algorithmen").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf031").setName("Objektorientierte Modellierung und Programmierung").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf200").setName("Grundlagen der Technischen Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf201").setName("Technische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf202").setName("Praktikum Technische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf203").setName("Eingebettete Systeme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf204").setName("Eingebettete Systeme II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf205").setName("Formale Methoden Eingebetteter Systeme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf207").setName("Grundlagen der Elektrotechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf208").setName("Mikrorobotik und Mikrosystemtechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf209").setName("Regelungstechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf210").setName("Signal- und Bildverarbeitung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf400").setName("Theoretische Informatik: Logik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf401").setName("Grundlagen der Theoretische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf403").setName("Kryptologie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf405").setName("Algorithmische Graphentheorie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf406").setName("Praktikum Realzeitsysteme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf407").setName("Programmverifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf408").setName("Algorithmen zur Software-Verifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf521").setName("Medizinische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf530").setName("Künstliche Intelligenz").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf540").setName("Anwendungen der KI").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf600").setName("Wirtschaftsinformatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf601").setName("Wirtschaftsinformatik II ").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf603").setName("Planung und Simulation in der Logistik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf608").setName("eBusiness").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf609").setName("Geschäftsprozessmanagement").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf610").setName("Enterprise Architecture Management").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf611").setName("Praktikum Wirtschaftsinformatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "PIundAI"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf612").setName("Re-Engineering von Geschäftsprozessen").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf700").setName("Didaktik der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf800").setName("Proseminar Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf803").setName("Spezielle Themen der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf804").setName("Spezielle Themen der Informatik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf805").setName("Spezielle Themen der Informatik III").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf806").setName("Spezielle Themen der Informatik IV").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf807").setName("Spezielle Themen der Informatik V").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf808").setName("Aktuelle Themen der Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf851").setName("Informatik und Gesellschaft").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf852").setName("IT-Projektmanagement").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf853").setName("Anwendungen der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf854").setName("Anwendungen der Informatik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf855").setName("Anwendungen der Informatik III").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf856").setName("Anwendungen der Informatik IV").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("inf857").setName("Anwendungen der Informatik V").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PIundAI", "PIundAI"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());

        wirtsModules.add(new ModuleModel.Builder().setId("mat030").setName("Analysis II a: Integralrechnung einer Variablen und Differentialgleichungen").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat200").setName("Algebra I: Ringe und Moduln").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat310").setName("Statistik I – Einführung in die Angewandte Statistik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat950").setName("Mathematik für Informatik (Diskrete Strukturen)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat955").setName("Mathematik für Informatik (Lineare Algebra)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat960").setName("Mathematik für Informatik (Analysis)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat990").setName("Mathematik für Ökonomen I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat991").setName("Mathematik für Ökonomen II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat996").setName("Einführung in die Numerik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("mat997").setName("Einführung in die Stochastik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-Informatik", "AS-Informatik"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());

        wirtsModules.add(new ModuleModel.Builder().setId("pb085").setName("Soft Skills").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("pb216").setName("Forschungsseminar Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("PB", "PB"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.optional).build());

        wirtsModules.add(new ModuleModel.Builder().setId("wir011").setName("Einführung in die BWL").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir021").setName("Buchhaltung und Abschluss").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir032").setName("Managerial Accounting").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir041").setName("Einführung in die VWL").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir060").setName("Financial Accounting").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir070").setName("Einführung in das Marketing").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir082").setName("Corporate Finance").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir083").setName("Beschaffung, Produktion und Logistik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir090").setName("Human Resource Management").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir100").setName("Unternehmensstrategien").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir130").setName("Bürgerliches Recht und Handelsrecht").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir150").setName("Statistik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl-Mathe", "Wahl-Mathe"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir160").setName("Entrepreneurship").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir200").setName("Organisation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir210").setName("Betriebliche Umweltpolitik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir260").setName("Umweltökonomie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir360").setName("Umwelt- und Nachhaltigkeitspolitik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("wir400").setName("Strategisches und Internationales Marketing").setMark(6).setKeys(new ArrayList<>(Arrays.asList("AS-WiWi", "AS-WiWi"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        wirtsModules.add(new ModuleModel.Builder().setId("BAM").setName("Bachelorabschlussmodul").setMark(15).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.mandatory).build());
    }

    private void initWirtsRecommendation() {
        wirtsRecommen = new ArrayList<>();

        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf030", "inf031", "inf004")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("mat950")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("wir011")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf600", "inf601")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("pb085")));

        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf852")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("wir083")));

        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf005")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("wir021")));

        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf800")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf007")));

        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf608")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("inf851")));
        wirtsRecommen.add(new ArrayList<>(Arrays.asList("pb216")));

    }

    private void initZwei30Modules() {
        zwei30Modules = new ArrayList<>();

        zwei30Modules.add(new ModuleModel.Builder().setId("inf030").setName("Programmierung, Datenstrukturen und Algorithmen").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf031").setName("Objektorientierte Modellierung und Programmierung").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());

        zwei30Modules.add(new ModuleModel.Builder().setId("inf200").setName("Grundlagen der Technischen Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf201").setName("Technische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf203").setName("Eingebettete Systeme I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf204").setName("Eingebettete Systeme II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl Techn"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf205").setName("Formale Methoden Eingebetteter Systeme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl Techn"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf207").setName("Grundlagen der Elektrotechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl Techn"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf208").setName("Mikrorobotik und Mikrosystemtechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl Techn"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf209").setName("Regelungstechnik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl Techn"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf210").setName("Signal- und Bildverarbeitung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Techn", "Wahl Techn"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());

        zwei30Modules.add(new ModuleModel.Builder().setId("inf400").setName("Theoretische Informatik: Logik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf401").setName("Grundlagen der Theoretische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf403").setName("Kryptologie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf405").setName("Algorithmische Graphentheorie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf407").setName("Programmverifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("inf408").setName("Algorithmen zur Software-Verifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());

        zwei30Modules.add(new ModuleModel.Builder().setId("inf700").setName("Didaktik der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());

        zwei30Modules.add(new ModuleModel.Builder().setId("pb023").setName("Grundlagen der Berufs- und Wirtschaftspädagogik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("pb024").setName("Grundlagen des beruflichen Lehrens und Lernens").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("pb025").setName("Beruf, Qualifikation und System").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("pb026").setName("Berufsbildungsforschung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pb-Pflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("pb027").setName("Ausgewählte Probleme, insbesondere Betrieb").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("pb029").setName("Ausgewählte Probleme, insbesondere berufliche Schulen").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("prx104").setName("Betriebspraktikum").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-PraxisPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        zwei30Modules.add(new ModuleModel.Builder().setId("prx105").setName("Allgemeines Schulpraktikum (Berufsbildende Schulen)").setMark(9).setKeys(new ArrayList<>(Arrays.asList("PB-PraxisPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
    }

    private void initZwei60Modules() {
        zwei60Modules = new ArrayList<>();
        zwei60Modules.add(new ModuleModel.Builder().setId("inf004").setName("Softwareprojekt").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf005").setName("Softwaretechnik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf009").setName("Praktikum Datenbanken").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf014").setName("Praktikum Betriebssysteme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf018").setName("Medienverarbeitung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf021").setName("Praktikum Fortgeschrittene Java-Technologien").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf030").setName("Programmierung, Datenstrukturen und Algorithmen").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf031").setName("Objektorientierte Modellierung und Programmierung").setMark(9).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf200").setName("Grundlagen der Technischen Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Basis-Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf202").setName("Praktikum Technische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("inf400").setName("Theoretische Informatik: Logik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf401").setName("Grundlagen der Theoretische Informatik").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf403").setName("Kryptologie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf405").setName("Algorithmische Graphentheorie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf406").setName("Praktikum Realzeitsysteme").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf407").setName("Programmverifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf408").setName("Algorithmen zur Software-Verifikation").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl Theo", "Wahl Theo"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("inf700").setName("Didaktik der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Basis-Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf800").setName("Proseminar Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.demi).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf803").setName("Spezielle Themen der Informatik I").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf804").setName("Spezielle Themen der Informatik II").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("inf808").setName("Aktuelle Themen der Informatik").setMark(3).setKeys(new ArrayList<>(Arrays.asList("Wahl", "Wahl"))).setSeason(ModuleModel.Season.unregular).setType(ModuleModel.Type.optional).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("mat950").setName("Mathematik für Informatik (Diskrete Strukturen)").setMark(6).setKeys(new ArrayList<>(Arrays.asList("Pflicht", "Pflicht"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("prx101").setName("Orientierungspraktikum").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-PraxisPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("pb006").setName("Pädagogik: Pädagogik und ihre Berufs- und Handlungsfelder").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-Pflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("pb007").setName("Pädagogik: Lehren und Lernen").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-Pflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("pb009").setName("Psychologie: Grundlagen der Psychologie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-Pflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("pb010").setName("Philosophie: Argumentatio").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("pb011").setName("Philosophie: Probleme der Praktischen Philosophie").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("pb012").setName("Globalisierung und Gesellschaft").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("sow214").setName("Politik: Politik im Mehrebenensystem").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("sow061").setName("Soziologie: Strukturen und Prozesse der Vergesellschaftung").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.optional).build());

        zwei60Modules.add(new ModuleModel.Builder().setId("pb015").setName("Soziologie: Individuum und Gesellschaft").setMark(6).setKeys(new ArrayList<>(Arrays.asList("PB-WahlPflicht", "PB"))).setSeason(ModuleModel.Season.winter).setType(ModuleModel.Type.optional).build());
        zwei60Modules.add(new ModuleModel.Builder().setId("prx102").setName("Allgemeines Schulpraktikum").setMark(9).setKeys(new ArrayList<>(Arrays.asList("PB-PraxisPflicht", "PB"))).setSeason(ModuleModel.Season.summer).setType(ModuleModel.Type.mandatory).build());
    }

    private void initZwei30Recommend() {
        zwei30Recommend = new ArrayList<>();

        if (Variables.spinnerLehtIndex == 0) {
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("inf030", "inf031")));
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("inf700")));
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("pb023")));
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("pb024")));
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("pb025")));
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("pb026")));
        } else {
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("inf030", "inf031")));
            zwei30Recommend.add(new ArrayList<>(Arrays.asList("inf200")));
        }

    }

    private void initZwei60Recommend() {
        zwei60Recommend = new ArrayList<>();

        if (Variables.spinnerLehtIndex == 0) {
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf030", "inf031")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf200")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("mat950")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf700")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf401")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf005")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf800")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("pb006")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("pb007")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("pb009")));
        } else {

            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf030", "inf031")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf200")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("mat950")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf700")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf401")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf005")));
            zwei60Recommend.add(new ArrayList<>(Arrays.asList("inf800")));
        }

    }

    public List<ModuleModel> getInfModules() {
        return infModules;
    }

    public List<ModuleModel> getWirtsModules() {
        return wirtsModules;
    }

    public List<ModuleModel> getZwei30Modules() {
        return zwei30Modules;
    }

    public List<ModuleModel> getZwei60Modules() {
        return zwei60Modules;
    }

    public List<ArrayList<String>> getInfRecommend() {
        return infRecommend;
    }

    public List<ArrayList<String>> getWirtsRecommen() {
        return wirtsRecommen;
    }

    public List<ArrayList<String>> getZwei30Recommend() {
        return zwei30Recommend;
    }

    public List<ArrayList<String>> getZwei60Recommend() {
        return zwei60Recommend;
    }
}
