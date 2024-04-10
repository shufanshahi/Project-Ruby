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
    @FXML
    Button colorChangeButton;

    public boolean flag = true;

    public static int[][][] buttonStates = new int[6][3][3];
    public static int currentColor = 0;

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

//                    int num = (row*3 + col);
//                    String buttonNumber = Integer.toString(num);
                    button.setText("");
//                    button.setStyle("-fx-border-width: 2px");

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
                    int rowIndex = row; int colIndex = col; int sideIndex = sides;

                    button.setOnAction(event -> handleButtonClick(rowIndex, colIndex, sideIndex, button));



                }
            }
        }

        colorCube();
        pressColorChange();

    }

    private void handleButtonClick(int rowIndex, int colIndex,int sideIndex, Button button){

        if(currentColor == 0)
        {
            button.setStyle("-fx-background-color: blue;");

        } else if (currentColor == 1) {
            button.setStyle("-fx-background-color: red;");

        }else if (currentColor == 2) {
            button.setStyle("-fx-background-color: green;");

        }else if (currentColor == 3) {
            button.setStyle("-fx-background-color: orange;");

        }else if (currentColor == 4) {
            button.setStyle("-fx-background-color: white;");

        }else {
            button.setStyle("-fx-background-color: yellow;");

        }

        buttonStates[sideIndex][rowIndex][colIndex] = currentColor;

    }

    public void pressColorChange()
    {
        currentColor = (currentColor+1)%6;


        if(currentColor == 0)
        {
            colorChangeButton.setStyle("-fx-background-color: blue;");

        } else if (currentColor == 1) {
            colorChangeButton.setStyle("-fx-background-color: red;");

        }else if (currentColor == 2) {
            colorChangeButton.setStyle("-fx-background-color: green;");

        }else if (currentColor == 3) {
            colorChangeButton.setStyle("-fx-background-color: orange;");

        }else if (currentColor == 4) {
            colorChangeButton.setStyle("-fx-background-color: white;");

        }else {
            colorChangeButton.setStyle("-fx-background-color: yellow;");

        }



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

    public void pressRotateX_Axis()
    {
        RotateCube.rotateX_Axis();
        colorCube();
    }
    public void pressRotateX_Axis_Dash()
    {
        RotateCube.rotateX_Axis_Dash();
        colorCube();
    }

    public void pressRotateY_Axis_Dash()
    {
       RotateCube.rotateY_Axis_Dash();
       colorCube();
    }

    public void pressRotateY_Axis()
    {
        RotateCube.rotateY_Axis();
        colorCube();
    }

    public void pressRotateF()
    {
        RotateCube.rotateF();
        colorCube();
    }

    public void pressRotateF_Dash()
    {
        RotateCube.rotateF_Dash();
        colorCube();
    }

    public void pressRotateB()
    {
        RotateCube.rotateB();
        colorCube();
    }

    public void pressRotateB_Dash()
    {
        RotateCube.rotateB_Dash();
        colorCube();
    }






}
