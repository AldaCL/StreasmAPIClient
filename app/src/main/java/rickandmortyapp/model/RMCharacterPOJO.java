package rickandmortyapp.model;

import java.util.List;
import java.util.Objects;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RMCharacterPOJO {


    @Generated("jsonschema2pojo")
    public class Example {

        @SerializedName("id")

        private Integer id;
        @SerializedName("name")

        private String name;
        @SerializedName("status")

        private String status;
        @SerializedName("species")

        private String species;
        @SerializedName("type")

        private String type;
        @SerializedName("gender")

        private String gender;
        @SerializedName("origin")

        private Origin origin;
        @SerializedName("location")

        private Location location;
        @SerializedName("image")

        private String image;
        @SerializedName("episode")

        private List<String> episode = null;
        @SerializedName("url")

        private String url;
        @SerializedName("created")

        private String created;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Origin getOrigin() {
            return origin;
        }

        public void setOrigin(Origin origin) {
            this.origin = origin;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public List<String> getEpisode() {
            return episode;
        }

        public void setEpisode(List<String> episode) {
            this.episode = episode;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Example example = (Example) o;
            return Objects.equals(id, example.id) && Objects.equals(name, example.name) && Objects.equals(status, example.status) && Objects.equals(species, example.species) && Objects.equals(type, example.type) && Objects.equals(gender, example.gender) && Objects.equals(origin, example.origin) && Objects.equals(location, example.location) && Objects.equals(image, example.image) && Objects.equals(episode, example.episode) && Objects.equals(url, example.url) && Objects.equals(created, example.created);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, status, species, type, gender, origin, location, image, episode, url, created);
        }

        @Override
        public String toString() {
            return "Example{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", status='" + status + '\'' +
                    ", species='" + species + '\'' +
                    ", type='" + type + '\'' +
                    ", gender='" + gender + '\'' +
                    ", origin=" + origin +
                    ", location=" + location +
                    ", image='" + image + '\'' +
                    ", episode=" + episode +
                    ", url='" + url + '\'' +
                    ", created='" + created + '\'' +
                    '}';
        }
    }
}