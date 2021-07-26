package com.dicoding.obsidian

object RocksData {
    private val rockNames = arrayOf(
        "Granite",
        "Diorite",
        "Gabro",
        "Peridotite",
        "Obsidian",
        "Gneiss",
        "Schist",
        "Slate",
        "Serpentinite",
        "Marble",
        "Conglomerate",
        "Breccia",
        "Sandstone",
        "Shale",
        "Siltstone"

    )

    private val heroDetails = arrayOf(

        "Igneous Rocks\n\n\nThe most common intrusive rock in Earth’s continental crust, granite is familiar as a mottled pink, white, gray, and black ornamental stone. It is coarse- to medium-grained. Its three main minerals are feldspar, quartz, and mica, which occur as silvery muscovite or dark biotite or both. Of these minerals, feldspar predominates, and quartz usually accounts for more than 10 percent. The alkali feldspars are often pink, resulting in the pink granite often used as a decorative stone.\n\nGranite crystallizes from silica-rich magmas that are miles deep in Earth’s crust. Many mineral deposits form near crystallizing granite bodies from the hydrothermal solutions that such bodies release.",
        "Igneous Rocks\n\n\nThis medium- to coarse-grained intrusive igneous rock is sometimes sold as “black granite”.  In general, though, diorite is darker than granite. It is commonly composed of about two-thirds white plagioclase feldspar and one-third dark-colored minerals, such as biotite and hornblende. The plagioclases in diorite—oligoclase or andesine—are rich in sodium. Diorite can be of uniform grain size or have large phenocrysts of plagioclase or hornblende.\n\nThe rock can occur as large intrusions or as smaller dykes and sills. Most diorite is intruded along the margins of continents. With small amounts of quartz and alkali feldspar, it becomes a granodiorite; with larger amounts, it is classified as granite.",
        "Igneous Rocks\n\n\nMedium or coarse-grained rocks, Gabbros consist principally of dark green pyroxene (augite and lesser amounts of orthopyroxene) plus white- or green colored plagioclase and black, millimeter-sized grains of magnetite and/or ilmenite. A gabbro has an intermediate or low silica content and rarely contains quartz. Gabbro is essentially the intrusive equivalent of basalt, but unlike basalt gabbro has a highly variable mineral content. It often contains a layering of light and dark minerals (layered gabbro), a significant amount of olivine (olivine gabbro), or a high percentage of coarse crystals of plagioclase feldspar (leucogabbro).\n\nGabbros are widespread but not common on Earth’s surface. They occur as intrusions and as uplifted sections of oceanic crust. Some gabbros are mined for their nickel, chromium, and platinum. Those containing ilmenite and magnetite are mined for their iron or titanium.",
        "Igneous Rocks\n\n\nAn intrusive igneous rock, peridotite is coarse grained and dense. It is light to dark green in color. Peridotite contains at least 40 percent olivine and some pyroxene. Unlike the olivine grains, the pyroxene grains in peridotite have a visible cleavage when viewed under a hand lens. Peridotite forms much of Earth’s mantle and can occur as nodules that are brought up from the mantle by kimberlite or basalt magmas.\n\nThe rock is usually found interlayered with iron- and magnesium-rich rocks in the lower parts of layered igneous rock bodies, where its denser crystals first form through selective crystallization and then settle to the bottom of still-fluid or semi-solid crystallizing mushes. A peridotite specimen that has been altered by weathering becomes serpentinite. Peridotite and pyroxenite form in similar environments, but pyroxenite contains a higher percentage of pyroxene. Peridotites are important sources of chromium and nickel.",
        "Igneous Rocks\n\n\nThe natural volcanic glass, obsidian forms when lava solidifies so quickly that crystals do not have time to form. Specimens are typically jet black, although the presence of hematite can produce red and brown variants. The inclusion of tiny gas bubbles can sometimes create a golden sheen. Tiny crystals of feldspar and phenocrysts of quartz can also be present. Obsidian can show flow banding.\n\nAlthough obsidian can have any chemical composition, most specimens have a composition similar to rhyolite and are found on the outer edges of rhyolite domes and flows. Like rhyolite, obsidian is also found along the rapidly cooled edges of sills and dykes. Most obsidian is relatively young, as the glass gradually crystallizes into minerals over a period of time.",
        "Metamorphic Rocks\n\n\nDistinct bands of minerals of different colors and grain sizes characterize this metamorphic rock. In most gneisses, these bands are folded, although the folds may be too large to see in hand specimens. Gneiss is a medium- to coarse-grained rock. Unlike schist, its foliation is well developed, but it has little or no tendency to split along planes. Most gneisses contain quartz and feldspar, but neither mineral is necessary for a rock to be called gneiss. Larger crystals of metamorphic minerals, such as garnet, can also be present.\n\nGneiss makes up the cores of many mountain ranges. It forms from sedimentary or granitic rocks at very high pressures and temperatures (1,065°F/575°C or above). A variety called pencil gneiss has rod-shaped individual minerals or mineral aggregates. In augen gneiss, the augens or “eyes” are single-mineral, eye-shaped grains that are larger than other grains in the rock. Orthogneiss is gneiss derived from igneous rock, and paragneiss is gneiss derived from sedimentary rock.",
        "Metamorphic Rocks\n\n\nThis metamorphic rock has a flaky and foliated texture. Specimens have wrinkled, wavy, or irregular sheets as a result of the parallel orientation of the component minerals.Schist shows distinct layering of light- and dark-colored minerals. The mineral assemblage varies, but mica is usually present. Most schists are composed of platy minerals, such as chlorite, graphite, talc, muscovite , and biotite. The mineral composition of a schist depends on its protolith or original rock and its metamorphic environment. The mineral assemblage can thus be used to determine the metamorphic history of the rock.",
        "Metamorphic Rocks\n\n\nA fine-grained metamorphic rock, slate occurs in a number of colors that depend on the minerals in the original sedimentary rock and the oxidation conditions under which that rock formed. Slate has a characteristic cleavage that allows it to be split into relatively thin, flat sheets. This is a result of microscopic mica crystals that have grown oriented in the same plane. True slates split along the foliation planes formed during metamorphism, rather than along the original sedimentary layers.\n\nSlate is common in regionally metamorphosed terrains. It forms when shale, mudstone, or volcanic rocks rich in silica are buried as well as subjected to low pressures and temperatures (up to 400°F/200°C). The ability of slate to split into thin sheets makes it ideal as a durable roofing material.",
        "Metamorphic Rocks\n\n\nAn attractive rock, Serpentinite is composed of serpentine and other serpentine-group minerals. It commonly has flowing bands of various colors, specially green and yellow. Serpentine minerals form by a metamorphic process called serpentinization that alters olivine and pyroxene-rich, silica-poor igneous rocks. This process occurs at low temperatures (up to 400°F/200°C) and in the presence of water. The original minerals are oxidized to produce serpentine, magnetite, and brucite. The degree to which a rock undergoes serpentinization depends on the composition of the parent rock and the mineral composition of its components, especially its olivine. For example, fayalite-rich olivines serpentinize differently than forsterite-rich olivines.\n\nSerpentinite is used as a decorative stone since it can be easily cut and polished. It is also mixed into concrete aggregate and used as a dry filler in the steel shielding jackets of nuclear reactors.",
        "Metamorphic Rocks\n\n\nA granular metamorphic rock, marble is derived from limestone or dolomite. It consists of a mass of interlocking grains of calcite or the mineral dolomite.\n\nMarbles form when limestone buried deep in the older layers of Earth’s crust is subjected to heat and pressure from thick layers of overlying sediments. It may also form as a result of contact metamorphism near igneous intrusions. Impurities in the limestone can recrystallize during metamorphism, resulting in mineral impurities in the marble, most commonly graphite , pyrite, quartz, mica, and iron oxides. In sufficient amounts, these can affect the texture and color of the marble.",
        "Sedimentary Rocks\n\n\nRocks formed by the lithification of rounded rock fragments that are over 1⁄16 in (2 mm) in diameter are known as conglomerates. They can be further classified by the average size of their constituent materials—pebble-conglomerate (fine), cobble-conglomerate (medium), and boulder-conglomerate (coarse). Conglomerate can also be known by the rock or mineral fragments in its composition; for example, a quartz pebble conglomerate.\n\nDepending on the environment in which these fragments are deposited, these rocks may be of two types. Well-sorted conglomerates result from water flow over a long period. These have well-sorted pebbles (with a small size variation) generally of only one rock or mineral type, and a few small particles between the pebbles. Poorly sorted conglomerates form from rapid water flow and deposition. They have poorly sorted pebbles (of varying sizes) of mixed rock and mineral types with a number of small particles between the pebbles.",
        "Sedimentary Rocks\n\n\nLithified sediments with rock fragments that are more than 1⁄16 in (2 mm) in diameter but angular or only slightly rounded are called breccias.The lack of rounding indicates that little or no transportation took place before the fragments became incorporated in the rock.\n\nBreccias can form in several ways. Rocks can shatter—for example, due to frost action or earth movement—and the fragments then become cemented in the new position. Shattered fragments may also move before being cemented—for example, they may accumulate at the base of a cliff or be carried by a flash flood. Breccias can also form in areas of active faulting. In areas where faulting occurs underwater, newly shattered material can also move in underwater landslides and become cemented to form breccia.",
        "Sedimentary Rocks\n\n\nThe second most abundant sedimentary rock, Sandstone makes up about 10 to 20 percent of the sedimentary rocks in Earth’s crust. Sandstones are classified according to texture and mineralogical properties into micaceous sandstone, orthoquartzite , and graywacke. They are usually dominated by quartz and have visible sandy grains and other minerals present in varying amounts. Well-rounded grains are typical of desert sandstone, while river sands are usually angular, and beach sands somewhere in between.\n\nBedding is often visible in sandstones as a series of layers representing successive deposits of grains. Bedding surfaces may show either ripples or the cross bedding typical of dunes. Sandstone is an important indicator of deposition and erosion processes.",
        "Sedimentary Rocks\n\n\nThe most abundant sedimentary rock, Shale makes up about 70 percent of all sedimentary rocks in Earth’s crust. It consists of a high percentage of clay minerals, substantial amounts of quartz, and smaller amounts of carbonates, feldspars, iron oxides, fossils, and organic matter. Shales are colored reddish and purple by hematite and goethite;blue, green, and black by ferrous iron; and gray or yellowish by calcite. They split easily into thin layers.\n\nShales consists of silt- and clay-sized particles deposited by gentle currents on deep ocean floors, shallow sea basins, and river floodplains. They occur thinly interbedded with layers of sandstone or limestone and in sheets up to several yards thick.",
        "Sedimentary Rocks\n\n\nFormed from grains whose sizes vary between that of sandstone and mudstone, siltstone is a sedimentary rock.  Like sandstone, it can form in different environments and have different colors and textures. Siltstones are typically red and gray with flat bedding planes. Plant fossils and other carbon-rich matter are common in darker-colored siltstones. Examples tend to be hard and durable and do not easily split into thin layers. However, the presence of mica may produce a siltstone that splits into thicker, flagstonelike sheets. In addition to mica, siltstone may contain abundant chlorite and other mica-rich clay minerals.\n\nAlthough many shales contain more than 50 percent silt, siltstones are usually chemically cemented and show cross-bedding, ripple marks, and internal layering. This indistinct layering tends to weather at oblique angles unrelated to bedding. Siltstone is less common than shale or sandstone and rarely forms thick deposits."
    )

    private val heroesImages = intArrayOf(
        R.drawable.granite,
        R.drawable.diorite,
        R.drawable.gabbro,
        R.drawable.peridotite,
        R.drawable.obsidian,
        R.drawable.gneiss,
        R.drawable.schist,
        R.drawable.slate,
        R.drawable.serpentinite,
        R.drawable.marble,
        R.drawable.conglomerate,
        R.drawable.breccia,
        R.drawable.sandstone,
        R.drawable.shale,
        R.drawable.siltstone
    )

    val listData: ArrayList<Rock>
        get() {
            val list = arrayListOf<Rock>()
            for (position in rockNames.indices) {
                val rock = Rock()
                rock.name = rockNames[position]
                rock.detail = heroDetails[position]
                rock.photo = heroesImages[position]
                list.add(rock)
            }
            return list
        }

}