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

    public boolean flag = true;

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

                    int num = (row*3 + col);
                    String buttonNumber = Integer.toString(num);
                    button.setText(buttonNumber);

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

                    Button button = new Button();

                    if(sides == 0)
                    {
                        button = (Button) frontFace.getChildren().get(row*3 + col +1);

                    } else if (sides == 1) {
                        button = (Button) rightFace.getChildren().get(row*3 + col +1);

                    }
                    else if (sides == 2) {
                        button = (Button) backFace.getChildren().get(row*3 + col +1);

                    }
                    else if (sides == 3) {
                        button = (Button) leftFace.getChildren().get(row*3 + col +1);

                    }else if (sides == 4) {
                        button = (Button) upperFace.getChildren().get(row*3 + col +1);

                    }else{
                        button = (Button) botttomFace.getChildren().get(row*3 + col +1);

                    }

                    if(buttonStates[sides][row][col] == 0)
                    {
                        button.setStyle("-fx-background-color: blue;");

                    } else if (buttonStates[sides][row][col] == 1) {
                        button.setStyle("-fx-background-color: red;");

                    }else if (buttonStates[sides][row][col] == 2) {
                        button.setStyle("-fx-background-color: green;");

                    }else if (buttonStates[sides][row][col] == 3) {
                        button.setStyle("-fx-background-color: orange;");

                    }else if (buttonStates[sides][row][col] == 4) {
                        button.setStyle("-fx-background-color: white;");

                    }else {
                        button.setStyle("-fx-background-color: yellow;");

                    }
                    
                }
            }
        }
    }





    public void pressButtonRotateU()
    {

        RotateCube.rotateU();
        colorCube();
    }

    public void pressButtonRotateU_Dash()
    {

        RotateCube.rotateU_Dash();
        colorCube();
    }

    public void pressButtonRotateD()
    {


        RotateCube.rotateD();
        colorCube();
    }

    public void pressButtonRotateD_Dash()
    {
        RotateCube.rotateD_Dash();
        colorCube();
    }

    public void pressButtonRotateR()
    {
        RotateCube.rotateR();
        colorCube();
    }

    public void pressButtonRotateR_Dash()
    {
        RotateCube.rotateR_Dash();
        colorCube();
    }

    public void pressButtonRotateL()
    {
        RotateCube.rotateL();
        colorCube();
    }

    public void pressButtonRotateL_Dash()
    {
        RotateCube.rotateL_Dash();
        colorCube();
    }




}
