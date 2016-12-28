package com.script972.Model;

import javafx.scene.control.TableView;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * Created by script972 on 28.12.2016.
 */
public class ValueMaterial {
    int id;
    String name;
    int count;
    String deciminal;
    int category;
    String serial_number;
    int id_survice;
    int create_by;

    public ValueMaterial(int id, String name, int count, String deciminal, int category, String serial_number) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.deciminal = deciminal;
        this.category = category;
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "ValueMaterial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", deciminal='" + deciminal + '\'' +
                ", category=" + category +
                ", serial_number='" + serial_number + '\'' +
                ", id_survice=" + id_survice +
                ", create_by=" + create_by +
                '}';
    }

    public ValueMaterial(int id, String name, int count, String deciminal, int category, String serial_number, int id_survice, int create_by) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.deciminal = deciminal;
        this.category = category;
        this.serial_number = serial_number;
        this.id_survice = id_survice;
        this.create_by = create_by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDeciminal() {
        return deciminal;
    }

    public void setDeciminal(String deciminal) {
        this.deciminal = deciminal;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public int getId_survice() {
        return id_survice;
    }

    public void setId_survice(int id_survice) {
        this.id_survice = id_survice;
    }

    public int getCreate_by() {
        return create_by;
    }

    public void setCreate_by(int create_by) {
        this.create_by = create_by;
    }
}
