public class Student{

  //variables
  String name;
  int counter = 0;
  int total = 0;
  int average;

  //name
  public Student(String name){
    this.name = name;
  }

  //adds quizes
  void addQuiz(int score){
    total = total + score;
    counter++;
  }

  //returns the total score
  int getTotalScore(){
    return total;
  }

  //returns the average score
  double getAverageScore(){
    average = total/counter;
    return average;
  }
}