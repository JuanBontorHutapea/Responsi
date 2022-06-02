/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo_123200117;

import Model.MovieModel;
import View.ViewMovie;
import Controller.ControllerMovie;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ViewMovie vm = new ViewMovie();
        MovieModel mm = new MovieModel();
        ControllerMovie cm = new ControllerMovie(mm, vm);
    }
    
}
