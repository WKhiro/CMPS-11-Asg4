/**
 * Sample object class for stuff that could be in a room.
 */
public class NotThing {
  private String name;
  
  public NotThing(String name) { 
    this.name = name;
  }
  
  public String toString() {
    return name;
  }
  
  String name() {
    return name;
  }
  
  boolean canBeCarried() {
    return false;
  }
  
}
