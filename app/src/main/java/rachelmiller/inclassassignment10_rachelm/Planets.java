package rachelmiller.inclassassignment10_rachelm;

import java.io.Serializable;

/**
 * Created by rachelmiller on 4/10/17.
 */

public class Planets implements Serializable {
    public String name;
    public String info;
    public int photoId;

    public Planets(String name, String info, int photoId) {
        this.name = name;
        this.info = info;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getPhotoId() {
        return photoId;
    }

    @Override
    public String toString() {
        return name + "\n" + info + "\n" + photoId;
    }

}
