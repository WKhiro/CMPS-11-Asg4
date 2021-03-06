class CryoFiles extends Thing{
  CryoFiles(){ //makes the name of the object
    super("cryonics files");
  }
  
  /**
   * Inspects the cryonics files and returns useful background information.
   */
  String inspect(){
    return "-EMERGENCY LOG AND GENERAL INFORMATION:\n" +
      "You are Test Subject 525. You were sent deep into untraversed space as part of a secret space\n" +
      "expedition planned by us, NASA. The fact that you are reading this at all means that\n" +
      "you have awoken from your cryostasis early, which also means that something has gone horribly\n" +
      "wrong. We won't have any idea what the issue is by the time you're reading this, but take care,\n" +
      "arm yourself, and don't be surprised if you see any oddities aboard the ship.\n\n" +
      "Charlie Bot: This doesn't look good, 525. We best make haste and investigate the ship.\n"; 
  }
}