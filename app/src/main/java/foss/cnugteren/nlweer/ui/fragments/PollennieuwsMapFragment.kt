package foss.cnugteren.nlweer.ui.fragments

class PollennieuwsMapFragment : BaseFragment() {

    override fun getURL(): String {
        return "https://pollennieuws.nl/weerkaart/KaartNL_280-website.png"
    }

    override fun imageWidth(): Int { return 640 }
    override fun imageHeight(): Int { return 724 }
    override fun coordinates(): Array<Float> { return arrayOf(50.60f, 1.85f, 54.05f, 7.20f, -0.10f, 0.09f) }
}
