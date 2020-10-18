/*
***********************************************************

Topic   : Program to demonstrate Logical AND ( && ) Operator in java.
Author  : Chpaone09®
Date    : Oct 19, 2020

************************************************************
*/

public class LogicalAND {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        if(a && b){
            System.out.print("\n\n\t Both A and B are True. ");
        }

        if(a && c){
            System.out.print("\n\n\t A is True and C is False. ");
        }

        if(b && c){
            System.out.print("\n\n\t B is True and C is False. ");
        }

        if(c && d){
            System.out.print("\n\n\t Both C and D are FALSE. ");
        }



    }
}
