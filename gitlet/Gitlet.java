package gitlet;

import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Gitlet {

    /**
     *create a .gitlet directory.
     * inside: create staging area, commits, blobs, heads
     */
    private void init() throws IOException {
        File f = new File("/.gitlet");
        if (f.exists() && f.isDirectory()) {
            System.out.println("A gitlet version-control system already exists in the current directory");
        } else {
            f.mkdir();
            File branches = new File("/.gitlet/branches");
            File stage = new File("/.gitlet/stage");
            File commits = new File("/.gitlet/stage");
            File blobs = new File("/.gitlet/blobs");
            File HEAD = new File("/.gitlet/HEAD");
            branches.mkdir();
            stage.mkdir();
            commits.mkdir();
            blobs.mkdir();
            HEAD.createNewFile();
            Commit initial_commit = commit(null, "initial commit");
            branch(initial_commit, "master");
            updateHead(initial_commit);
        }
    }

    /**
     * update index, add copies to staging area
     */
    private void add() {

    }

    /**
     * create commit object (track files), put into commits
     */
    private Commit commit(String parentId, String message) {
        return new Commit(parentId, message);
    }

    /**
     * tracked: index: untrack; working directory: delete; staging area: unstage
     * untracked: staged: unstage
     */
    private void rm() {

    }
    /**
     * id time message
     */
    private void log() {

    }

    /**
     * check the commit objects
     */
    private void find() {

    }

    /**
     * braches, stage, remove(index),
     * opntional: modification unstaged(index), untracked(working directory)
     */
    private void status() {

    }

    /**
     * [file name]: check commit for file-blob, replace;
     * [commit id] -- [file name]: same as above
     * [branch name] -- check branch--commit
     */
    private void checkout() {

    }

    /**
     * create new branch(commit), put into branches
     */
    private void branch(Commit front, String name) throws IOException {
        File theBranch = new File("/.gitlet/branches/" + name);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(theBranch));
        out.writeObject(front);
        out.close();
    }

    /**
     * branches
     */
    private void rmbranch() {

    }

    private void reset() {

    }

    /**
     * traverse back to the split point, find difference, update
     */
    private void merge() {

    }

    private void updateHead(Commit head) throws IOException {
        File outFile = new File("/.gitlet/HEAD");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile));
        out.writeObject(head);
        out.close();
    }
}
