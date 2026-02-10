class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (!knightIsAwake) {
            return true;
    }
        return false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
         return knightIsAwake || archerIsAwake || prisonerIsAwake; 
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {if (!archerIsAwake && prisonerIsAwake) {
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean     prisonerIsAwake, boolean petDogIsPresent) {
       if (petDogIsPresent && !archerIsAwake) {
           return true;
    }
    if (!knightIsAwake && !archerIsAwake && !petDogIsPresent && prisonerIsAwake){
          return true;
    }
     return false;
         }
}

