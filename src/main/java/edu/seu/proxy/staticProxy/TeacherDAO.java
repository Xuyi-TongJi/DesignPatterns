package edu.seu.proxy.staticProxy;

import edu.seu.proxy.ITeacherDAO;

public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
