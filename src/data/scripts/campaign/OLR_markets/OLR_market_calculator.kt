package data.scripts.campaign.OLR_markets.campaign.OLR_markets

import com.fs.starfarer.api.campaign.econ.MarketAPI

//NOTE: Every market gets one entity attached, and I have a bunch of functions within that basically serve as getters.

//NOTE: furthermore, the GDP calcs and so on should be calculated based on PlanetAPI stats and PlanetAPI conditions, and I'll add conditions that I need in a different file. I might have a custom condition for each market, simply named after the market, and a custom on-click on the condition itself brings you to the bar graphs and other custom OLR UI explaining the economics.

class OLR_market(private val market: MarketAPI) {
    val OLR_GDPF =;



    fun OLR_iterateGDP() {

    }


    fun OLR_calcGDP(market: MarketAPI): Float {}

        //NOTE: this needs to get both the size and the progress towards the next growth
    fun OLR_calcPop(market: MarketAPI): Int {}
}