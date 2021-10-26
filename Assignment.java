// Assignment.java -- class that represents an assignment
class Assignment{
  
  public String m_name;
  public AssignmentType m_type; 
  public int m_scored;
  public int m_possible;

  public String toString(){
    String rv = this.m_type.get_type() + " " + this.m_name + ":\t";
    rv += this.m_scored + "/" + this.m_possible + "\n";
    return rv;
  }

  public Assignment(){
    this.m_name = "";
    this.m_type = new AssignmentType();
    this.m_scored = -1;
    this.m_possible = -1;
  }

  public Assignment(String name, AssignmentType type, int scored, int possible){
    this.m_name = name;
    this.m_type = type;
    this.m_scored = scored;
    this.m_possible = possible;
  }
}

