package org.personaltrainer.persistence.bean;
// Generated 08-sep-2013 9:45:08 by Hibernate Tools 3.1.0.beta4

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * ExerciseMeasure generated by hbm2java
 */
@Entity
@Table(name="exercise_measure"
    ,catalog="personalTrainer"
, uniqueConstraints = {  }
)

public class ExerciseMeasure  implements java.io.Serializable {


    // Fields    

     private String codExerciseMeasureType;
     private Date createDate;
     private Date updateDate;
     private String updateUser;
     private String updateProgram;
     private int optimistLock;
     private String nameType;
     private String description;
     private Set exerciseRutineHistorics = new HashSet(0);
     private Set exerciseRutines = new HashSet(0);


    // Constructors

    /** default constructor */
    public ExerciseMeasure() {
    }

	/** minimal constructor */
    public ExerciseMeasure(String codExerciseMeasureType, Date createDate, Date updateDate, String updateUser, String updateProgram, int optimistLock, String nameType) {
        this.codExerciseMeasureType = codExerciseMeasureType;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.updateProgram = updateProgram;
        this.optimistLock = optimistLock;
        this.nameType = nameType;
    }
    
    /** full constructor */
    public ExerciseMeasure(String codExerciseMeasureType, Date createDate, Date updateDate, String updateUser, String updateProgram, int optimistLock, String nameType, String description, Set exerciseRutineHistorics, Set exerciseRutines) {
        this.codExerciseMeasureType = codExerciseMeasureType;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.updateProgram = updateProgram;
        this.optimistLock = optimistLock;
        this.nameType = nameType;
        this.description = description;
        this.exerciseRutineHistorics = exerciseRutineHistorics;
        this.exerciseRutines = exerciseRutines;
    }
    

   
    // Property accessors
    @Id
    @Column(name="COD_EXERCISE_MEASURE_TYPE", unique=true, nullable=false, insertable=true, updatable=true, length=10)

    public String getCodExerciseMeasureType() {
        return this.codExerciseMeasureType;
    }
    
    public void setCodExerciseMeasureType(String codExerciseMeasureType) {
        this.codExerciseMeasureType = codExerciseMeasureType;
    }
    @Column(name="CREATE_DATE", unique=false, nullable=false, insertable=true, updatable=true, length=19)

    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Column(name="UPDATE_DATE", unique=false, nullable=false, insertable=true, updatable=true, length=19)

    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    @Column(name="UPDATE_USER", unique=false, nullable=false, insertable=true, updatable=true, length=10)

    public String getUpdateUser() {
        return this.updateUser;
    }
    
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    @Column(name="UPDATE_PROGRAM", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getUpdateProgram() {
        return this.updateProgram;
    }
    
    public void setUpdateProgram(String updateProgram) {
        this.updateProgram = updateProgram;
    }
    @Column(name="OPTIMIST_LOCK", unique=false, nullable=false, insertable=true, updatable=true)

    public int getOptimistLock() {
        return this.optimistLock;
    }
    
    public void setOptimistLock(int optimistLock) {
        this.optimistLock = optimistLock;
    }
    @Column(name="NAME_TYPE", unique=false, nullable=false, insertable=true, updatable=true, length=50)

    public String getNameType() {
        return this.nameType;
    }
    
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
    @Column(name="DESCRIPTION", unique=false, nullable=true, insertable=true, updatable=true, length=100)

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="exerciseMeasure")

    public Set getExerciseRutineHistorics() {
        return this.exerciseRutineHistorics;
    }
    
    public void setExerciseRutineHistorics(Set exerciseRutineHistorics) {
        this.exerciseRutineHistorics = exerciseRutineHistorics;
    }
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="exerciseMeasure")

    public Set getExerciseRutines() {
        return this.exerciseRutines;
    }
    
    public void setExerciseRutines(Set exerciseRutines) {
        this.exerciseRutines = exerciseRutines;
    }
   








}