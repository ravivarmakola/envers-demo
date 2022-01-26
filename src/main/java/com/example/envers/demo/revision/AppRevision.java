//TODO: Change the package name according to your structure.
package com.example.envers.demo.revision;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;

@Entity
@RevisionEntity(value = AppRevisionListener.class)
@Setter
@Getter
/**
 * This class is responsible for adding custom columns in the REVISION table.<br/>
 * The table name will be generated (APP_REVISION) based on this class name.<br/>
 * Add more properties to populate more columns based on the requirement. <br/>
 * The values for these properties will  be set in custom implementation of
 * {@link org.hibernate.envers.RevisionListener}. Please visit {@link AppRevisionListener} for the same.<br/>
 * Please refer to @{@link RevisionEntity} and its value {@link AppRevisionListener} on how to set the values.<br/>
 *
 */
public class AppRevision extends DefaultRevisionEntity {
    /**
     * To add user who is responsible for change set.
     */
    private String userName;
    /**
     * Comments added while change is performed.
     */
    private String comment;
}
