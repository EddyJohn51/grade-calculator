// AssignmentType.java -- class that represents types of assignments
// in a weighted average system.
class AssignmentType{

  private String m_type;
  private double m_weight;

  public String toString(){
    return this.m_type + "\t" + this.m_weight;
  }

  public AssignmentType(){
    this.m_type = "";
    this.m_weight = -0.1;
  }

  public AssignmentType(String type, double weight){
    this.m_type = type;
    this.m_weight = weight;
  }

  public String get_type(){
    return this.m_type;
  }

  public double get_weight(){
    return this.m_weight;
  }

}
