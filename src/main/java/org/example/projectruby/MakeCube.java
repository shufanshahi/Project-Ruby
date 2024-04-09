package org.example.projectruby;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.Node;


public class MakeCube {
    public
    @FXML
    GridPane frontFace;
    @FXML
    GridPane rightFace;
    @FXML
    GridPane leftFace;
    @FXML
    GridPane botttomFace;
    @FXML
    GridPane backFace;
    @FXML
    GridPane upperFace;

    public static int[][][] buttonStates = new int[6][3][3];

//    public static int[][][] getButtonStates() {
//
//        return buttonStates;
//    }

    @FXML
    void initialize()
    {
        for(int sides = 0; sides<6; sides++)
        {
            for(int row=0; row<3; row++)
            {
                for(int col=0; col<3; col++)
                {
                    buttonStates[sides][row][col] = sides;
                    Button button = new Button();
                    button.setPrefSize(50,50);
                    button.setText("");
                    if(sides == 0) {
                        frontFace.add(button, col, row);
                    } else if (sides == 1) {
                        rightFace.add(button, col, row);
                    }
                    else if (sides == 2) {
                        backFace.add(button, col, row);
                    }
                    else if (sides == 3) {
                        leftFace.add(button, col, row);
                    }
                    else if (sides == 4) {
                        upperFace.add(button, col, row);
                    }
                    else{
                        botttomFace.add(button, col, row);
                    }



                }
            }
        }

        colorCube();

    }



    public void colorCube()
    {
        for(int sides = 0; sides<6; sides++)
        {
            for(int row=0; row<3; row++)
            {
                for(int col=0; col<3; col++)
                {



                }
            }
        }
    }



    public void pressButtonRotateU()
    {
        RotateCube.rotateU();
        colorCube();
    }




}
