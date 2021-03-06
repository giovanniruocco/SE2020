/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author studente
 */

@XmlRootElement(name = "Movie")
public class Movie {
    public String ID;
    public String title;
    public String year;
    public String directorID;
    public Director director;

    @Override
    public String toString() {
        return "Movie{" + "ID=" + ID + ", title=" + title + ", year=" + year + ", directorID=" + directorID + ", director=" + director + '}';
    }

  

    public void setID(String ID) {
        this.ID = ID;
    }



    public void setTitle(String title) {
        this.title = title;
    }

 
    public void setYear(String year) {
        this.year = year;
    }

    public void setDirectorID(String directorID) {
        this.directorID = directorID;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    
    
}
