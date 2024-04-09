package org.example.projectruby;

public class RotateCube {
    public static void rotateU()
    {
        int tempColors[][] = new int[4][3];
//        int buttonStates[][][] = MakeCube.getButtonStates();


        for(int sides=0; sides<4; sides++)
        {
            for(int col=0; col<3; col++)
            {
                tempColors[sides][col] = MakeCube.buttonStates[sides][0][col];
            }
        }

        MakeCube.buttonStates[0][0][0] = tempColors[3][0];
        MakeCube.buttonStates[0][0][1] = tempColors[3][1];
        MakeCube.buttonStates[0][0][2] = tempColors[3][2];

        for(int sides=1; sides<4; sides++)
        {
            for(int col=0; col<3; col++)
            {
                MakeCube.buttonStates[sides][0][col] = tempColors[sides-1][col];
            }
        }


    }
}
