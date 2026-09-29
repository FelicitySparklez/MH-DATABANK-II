import java.lang.foreign.AddressLayout;
import java.util.ArrayList;

public class MonsterData {


    //Monster Liste//
    public static ArrayList<Monster> getMonsterListe() {

        ArrayList<Monster> monsterListe = new ArrayList<>();

        // ==================================== Monster Hunter World/Iceborne ===================================== //

        monsterListe.add(
                new Monster(
                        1,
                        "Rathalos",
                        2,
                        new int[]{1, 2, 3, 4, 5, 6},
                        1
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        2,
                        "Anjanath",
                        3,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        3,
                        "Zinogre",
                        4,
                        new int[]{3, 4, 5},
                        3
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        4,
                        "Tobi-Kadachi",
                        4,
                        new int[]{5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        5,
                        "Alatreon",
                        5,
                        new int[]{3, 4, 5},
                        1,2, 3, 4, 5
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        6,
                        "Yian Garuga",
                        1,
                        new int[]{1, 2, 4, 5},
                        1
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        7,
                        "Fulgur Anjanath",
                        3,
                        new int[]{5, 6},
                        3
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        8,
                        "Banbaro",
                        3,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        9,
                        "Bazelgeuse",
                        2,
                        new int[]{5},
                        1
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        10,
                        "Seething Bazelgeuse",
                        2,
                        new int[]{5},
                        1
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        11,
                        "Beotodus",
                        6,
                        new int[]{5},
                        4
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        12,
                        "Dodogama",
                        4,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        13,
                        "Frostfang Barioth",
                        2,
                        new int[]{5},
                        4
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        14,
                        "Acidic Glavenus",
                        3,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        15,
                        "Great Girros",
                        4,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        16,
                        "Great Jagras",
                        4,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        17,
                        "Jyuratodus",
                        6,
                        new int[]{5},
                        2
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        18,
                        "Kulu-Ya-Ku",
                        1,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        19,
                        "Legiana",
                        2,
                        new int[]{5},
                        4
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        20,
                        "Shrieking Legiana",
                        2,
                        new int[]{5},
                        4
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        21,
                        "Odogaron",
                        4,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        22,
                        "Ebony Odogaron",
                        4,
                        new int[]{5},
                        5
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        23,
                        "Paolumu",
                        2,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        24,
                        "Nightshade Paolumu",
                        2,
                        new int[]{5},
                        0
                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        25,
                        "Pukei-Pukei",
                        1,
                        new int[]{5},
                        6

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        26,
                        "Coral Pukei-Pukei",
                        1,
                        new int[]{5},
                        2

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        27,
                        "Radobaan",
                        3,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        28,
                        "Uragaan",
                        3,
                        new int[]{3, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        29,
                        "Fatalis",
                        5,
                        new int[]{1, 2, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        30,
                        "Viper Tobi-Kadachi",
                        4,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        31,
                        "Tzitzi-Ya-Ku",
                        1,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        32,
                        "Scarred Yian Garuga",
                        1,
                        new int[]{2, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        33,
                        "Kulve Taroth",
                        5,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        34,
                        "Namielle",
                        5,
                        new int[]{5},
                        2, 3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        35,
                        "Nergigante",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        36,
                        "Ruiner Nergigante",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        37,
                        "Shara Ishvalda",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        38,
                        "Vaal Hazak",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        39,
                        "Blackveil Vaal Hazak",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        40,
                        "Velkhana",
                        5,
                        new int[]{5},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        41,
                        "Xeno´jiiva",
                        5,
                        new int[]{5},
                        1, 5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        42,
                        "Safi´jiiva",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        43,
                        "Zorah Magdaros",
                        5,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        44,
                        "Nargacuga",
                        2,
                        new int[]{2, 3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        45,
                        "Tigrex",
                        2,
                        new int[]{2, 3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        46,
                        "Brachydios",
                        3,
                        new int[]{3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        47,
                        "Raging Brachydios",
                        3,
                        new int[]{4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        48,
                        "Barioth",
                        2,
                        new int[]{3, 4, 5},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        49,
                        "Barroth",
                        3,
                        new int[]{3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        50,
                        "Deviljho",
                        3,
                        new int[]{3, 4, 5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        51,
                        "Savage Deviljho",
                        3,
                        new int[]{3, 4, 5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        52,
                        "Diablos",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        53,
                        "Black Diablos",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        54,
                        "Glavenus",
                        3,
                        new int[]{4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        55,
                        "Kirin",
                        5,
                        new int[]{1, 2, 4, 5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        56,
                        "Kushala Daora",
                        5,
                        new int[]{2, 4, 5, 6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        57,
                        "Lavasioth",
                        6,
                        new int[]{2, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        58,
                        "Lunastra",
                        5,
                        new int[]{2, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        59,
                        "Teostra",
                        5,
                        new int[]{2, 4, 5, 6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        60,
                        "Rajang",
                        11,
                        new int[]{2, 4, 5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        61,
                        "Furious Rajang",
                        11,
                        new int[]{2, 4, 5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        62,
                        "Azure Rathalos",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        63,
                        "Silver Rathalos",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        64,
                        "Rathian",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        65,
                        "Pink Rathian",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        66,
                        "Gold Rathian",
                        2,
                        new int[]{1, 2, 3, 4, 5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        67,
                        "Brute Tigrex",
                        2,
                        new int[]{3, 4, 5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        68,
                        "Stygian Zinogre",
                        4,
                        new int[]{3, 4, 5},
                        5

                )
        );

        // ===================================== Monster Hunter Wilds ==============================================//

        monsterListe.add(
                new Monster(
                        69,
                        "Ajarakan",
                        11,
                        new int[]{6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        70,
                        "Arkveld",
                        2,
                        new int[]{6},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        71,
                        "Balahara",
                        7,
                        new int[]{6},
                        2

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        72,
                        "Blangonga",
                        11,
                        new int[]{2, 4, 6},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        73,
                        "Chatacabra",
                        12,
                        new int[]{6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        74,
                        "Congalala",
                        11,
                        new int[]{2, 4, 6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        75,
                        "Doshaguma",
                        11,
                        new int[]{6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        76,
                        "Gore Magala",
                        5,
                        new int[]{4,5,6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        77,
                        "Gravios",
                        2,
                        new int[]{1,2,4,6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        78,
                        "Guardian Arkveld",
                        10,
                        new int[]{6},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        79,
                        "Guardian Doshaguma",
                        10,
                        new int[]{6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        80,
                        "Guardian Ebony Odogaron",
                        10,
                        new int[]{6},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        81,
                        "Guardian Fulgur Anjanath",
                        10,
                        new int[]{6},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        82,
                        "Guardian Rathalos",
                        10,
                        new int[]{6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        83,
                        "Gypceros",
                        1,
                        new int[]{1,2,4,6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        84,
                        "Hirabami",
                        7,
                        new int[]{6},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        85,
                        "Jin Dahaad",
                        7,
                        new int[]{6},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        86,
                        "Lala Barina",
                        9,
                        new int[]{6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        87,
                        "Nerscylla",
                        9,
                        new int[]{4,6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        88,
                        "Nu Udra",
                        8,
                        new int[]{6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        89,
                        "Quematrice",
                        3,
                        new int[]{6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        90,
                        "Rey Dau",
                        2,
                        new int[]{6},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        91,
                        "Rompopolo",
                        3,
                        new int[]{6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        92,
                        "Uth Duna",
                        7,
                        new int[]{6},
                        2

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        93,
                        "Xu Wu",
                        8,
                        new int[]{6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        94,
                        "Yian Kut-Ku",
                        1,
                        new int[]{1,2,4,6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        95,
                        "Zoh Shia",
                        10,
                        new int[]{6},
                        1, 3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        96,
                        "Mizutsune",
                        7,
                        new int[]{4,5,6},
                        2

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        97,
                        "Lagiacrus",
                        7,
                        new int[]{3,4,6},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        98,
                        "Seregios",
                        2,
                        new int[]{4,5,6},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        99,
                        "Gogmazios",
                        5,
                        new int[]{4,6},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        100,
                        "Lao-Shan Lung",
                        5,
                        new int[]{1,2,4,6},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        101,
                        "Ashen Lao-Shan Lung",
                        5,
                        new int[]{1,2},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        102,
                        "Crimson Fatalis",
                        5,
                        new int[]{1,2,4},
                        1, 5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        103,
                        "White Fatalis",
                        5,
                        new int[]{2,4},
                        3, 5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        104,
                        "Rusted Kushala Daora",
                        5,
                        new int[]{2,4},
                        4, 5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        105,
                        "Chameleos",
                        5,
                        new int[]{2,4,5},
                        2, 5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        106,
                        "Yama Tsukami",
                        5,
                        new int[]{2},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        107,
                        "Jhen Mohran",
                        5,
                        new int[]{3},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        108,
                        "Hallowed Jhen Mohran",
                        5,
                        new int[]{3},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        109,
                        "Ceadeus",
                        5,
                        new int[]{3},
                        2,5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        110,
                        "Goldbeard Ceadeus",
                        5,
                        new int[]{3},
                        2

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        111,
                        "Amatsu",
                        5,
                        new int[]{3,4,5},
                        2, 3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        112,
                        "Dire Miralis",
                        5,
                        new int[]{3},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        113,
                        "Oroshi Kirin",
                        5,
                        new int[]{4},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        114,
                        "Shagaru Magala",
                        5,
                        new int[]{4,5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        115,
                        "Dah´ren Mohran",
                        5,
                        new int[]{4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        116,
                        "Dalamadur",
                        5,
                        new int[]{4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        117,
                        "Shah Dalamadur",
                        5,
                        new int[]{4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        118,
                        "Nakarkos",
                        5,
                        new int[]{4},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        119,
                        "Valstrax",
                        5,
                        new int[]{4,5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        120,
                        "Risen Kushala Daora",
                        5,
                        new int[]{5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        121,
                        "Risen Chameleos",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        122,
                        "Risen Teostra",
                        5,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        123,
                        "Risen Shagaru Magala",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        124,
                        "Crimson Glow Valstrax",
                        5,
                        new int[]{5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        125,
                        "Risen Crimson Glow Valstrax",
                        5,
                        new int[]{5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        126,
                        "Wind Serpent Ibushi",
                        5,
                        new int[]{5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        127,
                        "Thunder Serpent Narwa",
                        5,
                        new int[]{5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        128,
                        "Narwa the Allmother",
                        5,
                        new int[]{5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        129,
                        "Malzeno",
                        5,
                        new int[]{5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        130,
                        "Primordial Malzeno",
                        5,
                        new int[]{5},
                        5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        131,
                        "Gaismagorm",
                        5,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        132,
                        "Basarios",
                        2,
                        new int[]{1,2,4,5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        133,
                        "Black Gravios",
                        2,
                        new int[]{1,2,4},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        134,
                        "Khezu",
                        2,
                        new int[]{1,2,4,5,6},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        135,
                        "Red Khezu",
                        2,
                        new int[]{1,2,4},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        136,
                        "Monoblos",
                        2,
                        new int[]{1,2,4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        137,
                        "White Monoblos",
                        2,
                        new int[]{1,2,4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        138,
                        "Akantor",
                        2,
                        new int[]{2,3,4},
                        1, 5

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        139,
                        "Ukanlos",
                        2,
                        new int[]{2,3,4},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        140,
                        "Sand Barioth",
                        2,
                        new int[]{3},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        141,
                        "Gigginox",
                        2,
                        new int[]{3},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        142,
                        "Baleful Gigginox",
                        2,
                        new int[]{3},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        143,
                        "Green Nargacuga",
                        2,
                        new int[]{3},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        144,
                        "Lucent Nargacuga",
                        2,
                        new int[]{3,5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        145,
                        "Astalos",
                        2,
                        new int[]{4,5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        146,
                        "Boltreaver Astalos",
                        2,
                        new int[]{4},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        147,
                        "Ruby Basarios",
                        2,
                        new int[]{4},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        148,
                        "Bloodbath Diablos",
                        2,
                        new int[]{4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        149,
                        "Silverwind Nargacuga",
                        2,
                        new int[]{4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        150,
                        "Dreadking Rathalos",
                        2,
                        new int[]{4},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        151,
                        "Dreadqueen Rathian",
                        2,
                        new int[]{4},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        152,
                        "Apex Diablos",
                        2,
                        new int[]{5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        153,
                        "Espinas",
                        2,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        154,
                        "Flaming Espinas",
                        2,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        155,
                        "Apex Rathalos",
                        2,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        156,
                        "Thunderlord Zinogre",
                        4,
                        new int[]{4},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        157,
                        "Apex Zinogre",
                        4,
                        new int[]{5},
                        3

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        158,
                        "Blue Yian Kut-Ku",
                        1,
                        new int[]{1,2,3,4},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        159,
                        "Jade Barroth",
                        3,
                        new int[]{3},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        160,
                        "Hellblade Glavenus",
                        3,
                        new int[]{4},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        161,
                        "Apex Rathian",
                        2,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        162,
                        "Copper Blangonga",
                        11,
                        new int[]{2},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        163,
                        "Emerald Congalala",
                        11,
                        new int[]{2,4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        164,
                        "Garangolm",
                        11,
                        new int[]{5},
                        1,2

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        165,
                        "Arzuros",
                        11,
                        new int[]{3,4,5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        166,
                        "Goss Harag",
                        11,
                        new int[]{5},
                        4

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        167,
                        "Chaotic Gore Magala",
                        5,
                        new int[]{4,5},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        168,
                        "Purple Gypceros",
                        1,
                        new int[]{1,2,4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        169,
                        "Shrouded Nerscylla",
                        9,
                        new int[]{4},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        170,
                        "Rakna-Kadaki",
                        9,
                        new int[]{5},
                        1

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        171,
                        "Pyre Rakna-Kadaki",
                        9,
                        new int[]{5},
                        1

                )
        );


        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        172,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        173,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        174,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );


        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        175,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        176,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        177,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        177,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );

        //---------------------------------------------------------------//

        monsterListe.add(
                new Monster(
                        178,
                        "",
                        0,
                        new int[]{0},
                        0

                )
        );


        //---------------------------------------------------------------//
        // Monster-Verwandschaften
        //---------------------------------------------------------------//

        //Rathalos
        addRelatedMonsters(monsterListe, 1, 62, 63, 150, 155, 64, 82, 65, 66, 151);

        //Anjanath
        addRelatedMonsters(monsterListe, 2, 7, 81);

        //Zinogre
        addRelatedMonsters(monsterListe, 3, 68, 156, 157);

        //Tobi-Kadachi
        addRelatedMonsters(monsterListe, 4, 30 );

        //Yian Garuga
        addRelatedMonsters(monsterListe, 6, 32, 94, 158);

        //Fulgur Anjanath
        addRelatedMonsters(monsterListe, 7,2, 81);

        //Bazelgeuse
        addRelatedMonsters(monsterListe, 9 ,10);

        //Beotodus
        addRelatedMonsters(monsterListe, 11, 57, 17);

        //Dodogama
        addRelatedMonsters(monsterListe,12 ,15, 16 );

        //Frostfang Barioth
        addRelatedMonsters(monsterListe, 13, 48 , 140);

        //Acidic Glavenus
        addRelatedMonsters(monsterListe, 14, 54, 160);

        //Great Girros
        addRelatedMonsters(monsterListe, 15, 16, 12);

        //Great Jagras
        addRelatedMonsters(monsterListe, 16, 15, 12);

        //Jyuratodus
        addRelatedMonsters(monsterListe, 17,57, 11);

        //Kulu-Ya-Ku
        addRelatedMonsters(monsterListe,18, 31);

        //Legiana
        addRelatedMonsters(monsterListe,19 ,20);

        //Odogaron
        addRelatedMonsters(monsterListe,21 ,22, 80, 4, 30);

        //Paolumu
        addRelatedMonsters(monsterListe, 23, 24);

        //Pukei-Pukei
        addRelatedMonsters(monsterListe,25, 26);

        //Radobaan
        addRelatedMonsters(monsterListe, 27 ,28);

        //Fatalis
        addRelatedMonsters(monsterListe,29, 102, 103, 112);

        //Nergigante
        addRelatedMonsters(monsterListe,35, 36);

        //Vaal Hazak
        addRelatedMonsters(monsterListe, 38, 39);

        //Xeno´jiiva
        addRelatedMonsters(monsterListe,41,42);

        //Nargacuga
        addRelatedMonsters(monsterListe, 44, 143, 144, 149, 13, 48, 140);

        //Tigrex
        addRelatedMonsters(monsterListe, 45, 67);

        //Brachydios
        addRelatedMonsters(monsterListe, 46,47);

        //Barioth
        addRelatedMonsters(monsterListe, 48, 140);

        //Barroth
        addRelatedMonsters(monsterListe,49, 159);

        //Deviljho
        addRelatedMonsters(monsterListe,50 ,51);

        //Diablos
        addRelatedMonsters(monsterListe, 52, 53, 148, 152, 136);

        //Glavenus
        addRelatedMonsters(monsterListe,54, 160 );

        //Kirin
        addRelatedMonsters(monsterListe,55, 113);

        //Kushala Daora
        addRelatedMonsters(monsterListe,56, 104, 120);

        //Lavasioth
        addRelatedMonsters(monsterListe, 57, 17, 11);

        //Lunastra
        addRelatedMonsters(monsterListe,58, 59);

        //Teostra
        addRelatedMonsters(monsterListe,59, 122);

        //Rajang
        addRelatedMonsters(monsterListe,60, 61, 72, 74);

        //Rathian
        addRelatedMonsters(monsterListe,64 ,65, 66, 161, 151, 62, 63, 82, 150, 155);

        //Stygian Zinogre
        addRelatedMonsters(monsterListe, 68, 3, 156, 157);

        //Arkveld
        addRelatedMonsters(monsterListe,70, 78);

        //Blangonga
        addRelatedMonsters(monsterListe,72, 162, 74, 163, 164);

        //Congalala
        addRelatedMonsters(monsterListe,74, 163, 72, 162, 60, 61, 164);

        //Doshaguma
        addRelatedMonsters(monsterListe,75, 79, 165, 166);

        //Gore Magala
        addRelatedMonsters(monsterListe, 76, 167, 114, 123);

        //Gravios
        addRelatedMonsters(monsterListe,77 ,133, 132, 147);

        //Gypceros
        addRelatedMonsters(monsterListe, 83, 168);

        //Nerscylla
        addRelatedMonsters(monsterListe, 87, 169, 170, 171);

        //Lao-Shan Lung
        addRelatedMonsters(monsterListe,100, 101, 43);

        //Zorah Magdaros
        addRelatedMonsters(monsterListe,43, 100, 101);

        //Xu Wu
        addRelatedMonsters(monsterListe,93, 88 );

        //Yian Kut-Ku
        addRelatedMonsters(monsterListe,94 ,158, 6, 32);

        //Mizutsnue-96

        //Lagiacrus-97

        //Chameleos
        addRelatedMonsters(monsterListe, 105, 121, 34);

        //Jhen Mohran
        addRelatedMonsters(monsterListe, 107, 108, 115);

        //Ceadeus
        addRelatedMonsters(monsterListe,109, 110);

        //Dire Miralis
        addRelatedMonsters(monsterListe,112, 29, 102, 103);

        //Shagaru Magala
        addRelatedMonsters(monsterListe,114, 76, 167, 123);

        //Dah´ren Mohran
        addRelatedMonsters(monsterListe,115, 107, 108);

        //Dalamadur
        addRelatedMonsters(monsterListe,116, 117);

        //Valstrax
        addRelatedMonsters(monsterListe, 119, 124, 125);

        //Wind Serpent Ibushi
        addRelatedMonsters(monsterListe, 126, 127, 128);

        //Malzeno
        addRelatedMonsters(monsterListe,129, 130);

        //Basarios
        addRelatedMonsters(monsterListe,132, 147, 77, 133);

        //Black Gravios
        addRelatedMonsters(monsterListe,133, 77, 132, 147);

        //Khezu
        addRelatedMonsters(monsterListe,134, 135, 141, 142);

        //Red Khezu
        addRelatedMonsters(monsterListe,135, 134, 141, 142);

        //Monoblos
        addRelatedMonsters(monsterListe, 136, 137, 52, 53, 152, 148);

        //White Monoblos
        addRelatedMonsters(monsterListe,137, 136, 52, 53, 152, 148);

        //Akantor
        addRelatedMonsters(monsterListe,138, 139);

        //Sand Barioth
        addRelatedMonsters(monsterListe,140 , 48, 13, 44, 143, 144, 149);

        //Gigginox
        addRelatedMonsters(monsterListe,141, 142, 134, 135);

        //Green Nargacuga
        addRelatedMonsters(monsterListe,143, 44, 144, 149, 48, 13, 140);

        //Lucent Nargacuga
        addRelatedMonsters(monsterListe,144, 44, 143, 149, 48, 13, 140);

        //Astalos
        addRelatedMonsters(monsterListe,145, 146);

        //Bloodbath Diablos
        addRelatedMonsters(monsterListe, 148, 52, 53, 152);

        //Silverwind Nargacuga
        addRelatedMonsters(monsterListe,149, 48, 13);

        //Dreadking Rathalos
        addRelatedMonsters(monsterListe,150, 1, 62, 63, 155, 82, 64);

        //Dreadqueen Rathian
        addRelatedMonsters(monsterListe,151, 64, 65, 66, 161, 1);

        //Espinas
        addRelatedMonsters(monsterListe,153, 154);

        //Apex Rathalos
        addRelatedMonsters(monsterListe,155, 62, 63, 82);

        //Thunderlord Zinogre
        addRelatedMonsters(monsterListe,156, 3, 157, 68);

        //Apex Zinogre
        addRelatedMonsters(monsterListe,157, 3, 68, 156);

        //Blue Yian Kut-Ku
        addRelatedMonsters(monsterListe,158, 94, 6, 32);

        //Apex Rathian
        addRelatedMonsters(monsterListe,161, 65, 66, 151, 1);

        //Emerald Congalala
        addRelatedMonsters(monsterListe,163, 74, 72, 162, 60, 61, 164);

        //Garangolm
        addRelatedMonsters(monsterListe,164, 74, 163, 72, 162, 60, 61);

        //Arzuros
        addRelatedMonsters(monsterListe,165, 166);

        //Chaotic Gore Magala
        addRelatedMonsters(monsterListe,167, 76, 114, 123);

        //Shrouded Nerscylla
        addRelatedMonsters(monsterListe,169, 87, 170, 171);

        //Rakna-Kadaki
        addRelatedMonsters(monsterListe,170, 171);



        // monster kontrollieren, ob diese die richtigen relations eingetragen haben!



        return monsterListe;

    }

    private static void addRelatedMonsters(
            ArrayList<Monster> monsterListe,
            int monsterId,
            int... relatedIds) {

        Monster monster = null;

        // Hauptmonster suchen
        for (Monster m : monsterListe) {

            if (m.getMonsterId() == monsterId) {
                monster = m;
                break;
            }
        }

        // Falls das Monster nicht existiert
        if (monster == null) {
            return;
        }

        // Verwandte Monster hinzufügen
        for (int relatedId : relatedIds) {

            for (Monster relatedMonster : monsterListe) {

                if (relatedMonster.getMonsterId() == relatedId) {

                    monster.addRelatedMonster(relatedId);

                    relatedMonster.addRelatedMonster(monsterId);

                    break;
                }
            }
        }
    }
}