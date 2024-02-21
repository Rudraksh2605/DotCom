import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DotCom {

    private ArrayList <String> locationCells;
    private String name;

    public void setLocationCells(ArrayList <String> loc) {
        locationCells = loc;

    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");

            }
            else {
                result = "hit";

            }
        }

        return result;



    }




}