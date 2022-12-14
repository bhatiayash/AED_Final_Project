/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Booking.BookingTime;
import Business.Booking.RoomDirectory;
import Business.Program.ProgramDirectory;
import Business.Role.Role;
import Business.WorkQueue.BookingQueue;
import Business.WorkQueue.ProgramQueue;

import Business.HireApplications.NewHireApplicationsDirectory;
import java.util.ArrayList;

/**
 *
 * @author keshni
 */
public class GymEnterprise extends Enterprise {

    private ProgramQueue programQueue;
    private ProgramDirectory programDirectory;
    private BookingQueue bookingQueue;
    private RoomDirectory roomDirec;
    private BookingTime appointmentTime;
    private NewHireApplicationsDirectory newHireDirec;

    
    public GymEnterprise(String name){
        super(name,EnterpriseType.Gym);
        this.appointmentTime = new BookingTime();
        this.roomDirec = new RoomDirectory();
        this.programDirectory = new ProgramDirectory();
        
        bookingQueue = new BookingQueue();
        programQueue = new ProgramQueue();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ProgramQueue getProgramQueue() {
        return programQueue;
    }

    public void setProgramQueue(ProgramQueue programQueue) {
        this.programQueue = programQueue;
    }
   

    public ProgramDirectory getProgramDirectory() {
        return programDirectory;
    }

    public void setProgramDirectory(ProgramDirectory programDirectory) {
        this.programDirectory = programDirectory;
    }
    

    public BookingQueue getBookingQueue() {
        return bookingQueue;
    }

    public void setBookingQueue(BookingQueue bookingQueue) {
        this.bookingQueue = bookingQueue;
    }

    public RoomDirectory getRoomDirec() {
        return roomDirec;
    }

    public void setRoomDirec(RoomDirectory roomDirec) {
        this.roomDirec = roomDirec;
    }


    public BookingTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(BookingTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    
    public NewHireApplicationsDirectory getNewHireDirec() {
        return newHireDirec;
    }

    public void setNewHireDirec(NewHireApplicationsDirectory newHireDirec) {
        this.newHireDirec = newHireDirec;
    }
    
    
}
