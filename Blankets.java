class Blankets extends Thing{
  Blankets(){ //makes the name of the object
    super("blankets");
  }
  
  /**
   * Returns player's attempt to snuggle the blankets, resulting in text from Charlie Bot.
   */
  String snuggle(){
    return "-Charlie Bot: I realize those blankets are warm, but we should really keep moving, 525.";
  }
  
  /**
   * Inspects the blankets and returns useful information on its functions.
   */
  String inspect(){
    return "-Charlie Bot: These are blankets, 525.\n" +
      "They're rather soft and warm, and when complimented with a comfy pillow, quickly lull people to sleep.\n\n" +
      "You could 'snuggle' the blankets, but that's about it."; 
  }
}