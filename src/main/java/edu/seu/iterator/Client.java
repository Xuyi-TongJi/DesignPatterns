package edu.seu.iterator;

import edu.seu.iterator.aggregate.College;
import edu.seu.iterator.aggregate.ComputerCollege;
import edu.seu.iterator.aggregate.EnergyCollege;
import edu.seu.iterator.output.OutputImpl;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege();
        EnergyCollege energyCollege = new EnergyCollege();
        List<College> collegeList = new ArrayList<>();
        collegeList.add(computerCollege);
        collegeList.add(energyCollege);
        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
