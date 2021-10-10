package org.firstinspires.ftc.teamcode.Autonomous;
//Au†on class
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "ShaanAutonomousMethods", group = "LinearOpMode")
public class ShaanAutonomousMethods extends LinearOpMode {
    DcMotor frontRightMotor;
    DcMotor frontLeftMotor;
    DcMotor backRightMotor;
    DcMotor backLeftMotor;
    static final double wheelDiameter = 3;
    static final double ticksPerRevolution = 537.6;
    double circumference = Math.PI * wheelDiameter;
    //makes robot go forward by a certain distance(inches)
    public void forward(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontRightMotor.setTargetPosition((int)ticks);
        frontLeftMotor.setTargetPosition((int)ticks);
        backRightMotor.setTargetPosition((int)ticks);
        backLeftMotor.setTargetPosition((int)ticks);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }
    //makes robot go backward by a certain distance(inches)
    public void backward(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontRightMotor.setTargetPosition(((int)ticks)*-1);
        frontLeftMotor.setTargetPosition(((int)ticks)*-1);
        backRightMotor.setTargetPosition(((int)ticks)*-1);
        backLeftMotor.setTargetPosition(((int)ticks)*-1);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }
    // if your are strafing right, the back left and front right are negative, going left means that front left and back right are negative
    
    public void strafeRight(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontRightMotor.setTargetPosition(((int)ticks)*-1);
        frontLeftMotor.setTargetPosition((int)ticks);
        backRightMotor.setTargetPosition((int)ticks);
        backLeftMotor.setTargetPosition(((int)ticks)*-1);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }
    public void strafeLeft(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontRightMotor.setTargetPosition((int)ticks);
        frontLeftMotor.setTargetPosition(((int)ticks)*-1);
        backRightMotor.setTargetPosition(((int)ticks)*-1);
        backLeftMotor.setTargetPosition((int)ticks);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }
    public void FrontRightDiagonal(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);


        frontLeftMotor.setTargetPosition(((int)ticks));
        backRightMotor.setTargetPosition(((int)ticks));


        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }
    public void FrontLeftDiagonal(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontRightMotor.setTargetPosition((int)ticks);
        backLeftMotor.setTargetPosition((int)ticks);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }

    public void BackRightDiagonal(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontLeftMotor.setTargetPosition(((int)ticks)*-1);
        backRightMotor.setTargetPosition(((int)ticks)*-1);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }
    public void BackLeftDiagonal(double distance) {
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        double rotations = distance/circumference;
        double ticks = (rotations*ticksPerRevolution);

        frontRightMotor.setTargetPosition((int)ticks * -1);
        backLeftMotor.setTargetPosition((int)ticks * -1);

        frontRightMotor.setPower(1);
        frontLeftMotor.setPower(1);
        backRightMotor.setPower(1);
        backLeftMotor.setPower(1);

        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        while(frontLeftMotor.isBusy() || frontRightMotor.isBusy() || backLeftMotor.isBusy() || backRightMotor.isBusy()){

        }
        frontRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);

    }

    @Override
    public void runOpMode() throws InterruptedException {

    }

/*
    public void runOpMode() throws InterruptedException {
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        waitForStart();
        forward(10);
        strafeLeft(10);
        backward(10);
        strafeRight(10);
        FrontLeftDiagonal(10);
        FrontRightDiagonal(10);
        BackRightDiagonal(10);
        BackLeftDiagonal(10);


    }

*/



}

