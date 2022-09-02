// Marvish Chandra

/* SR = salt rejection
   cfw = conductivity of feed water
   cpw = conductivity of permeate water
   cf = conductivity of feed
*/

/* pfr = permeate flow rate
   ffr = feed flow rate
*/

/* Gfd = finding flux, amount of water that passes through reverse osmosis membrane
   gp = gpm of permeate
   RO = number of membrate elements in system
   sq = square footage of each membrane element
*/

// Mass balance equation determines the flow and quality of the entire reverse osmosis process





public class filtrationMethods{
    public static void saltRejection(String[] SR, cfw, cpw, cf){
        assert SR = ((cfw - cpw) / cf) * 100
    }
    public static void saltPassage(String[] SP){
        assert SP = (1 - SR)
    }
    public static void waterRecovery(String[] recovery,pfr, ffr){
        assert recovery = (pfr/ffr) * 100
    }
    public static void concentrationFactor(String[] CF){
        assert CF = (1/(1-recovery))
    }
    public static void flux(String [] Gfd,gp,RO,sq){
        assert Gfd = (gp * 1440)/(RO * sq)
    }
    public static void massBalance(String [] permeateFlow, concentrateFlow, feedConductivity, permeateConductivity, concentrateConductivity){
        feedFlow = permeateFlow + concentrateFlow
        assert (feedFlow * feedConductivity) = (permeateFlow * permeateConductivity) + (concentrateFlow * concentrateConductivity)
    }
}