package gitlet;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

class Commit implements Serializable {
    // Constructor
    public Commit(String parentId, String message) {
        parent = parentId;
        this.message = message;
        commitDate = new Date();
    }

// Fields
    /**
     * The SHA-1 identifier of my parent, or null if I am the initial commit.
     * need to create a runtime map;
     */
    private final String parent;
    /**
     * My log message.
     */
    private final String message;
    /**
     * My timestamp. (java.util.Date)
     */
    private Date commitDate;
    /**
     * A mapping of file names to the SHA-1's of their blobs.
     */
    private HashMap<String, String> contents = new HashMap<>();

    // For log;
    public String toString(){
        return null;
    }

    /**
     * Get SHA-1 identifier of my parent, or null if I am the initial commit.
     */
    String getParent() {
        return parent;
    }

    /**
     * Finalize me and write me to my repository.
     * serialize, io
     */
    void Finalize() {

    }
    /* Assorted getters and setters for contents and other fields excluded.
       Methods supporting merge also excluded. */
}