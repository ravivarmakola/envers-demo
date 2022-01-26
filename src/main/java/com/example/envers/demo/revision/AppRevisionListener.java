//TODO: Change the package name according to your structure.
package com.example.envers.demo.revision;

import org.hibernate.envers.RevisionListener;

/**
 * This class is responsible for setting {@link AppRevision} properties
 * according to project requirements.
 */
public class AppRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        AppRevision rev = (AppRevision) revisionEntity;
        // TODO: User can be set from Security Context.
        //  Ex: SecurityContextHolder.getContext().getAuthentication().getPrinciple()
        rev.setUserName("SuperUser");
        // TODO: Set the comment from request object ?
        rev.setComment("This is dummy comment");
    }
}
