package playlist

import com.music.Song

class BootStrap {

    def init = { servletContext ->
        5.times { new Song(title: "Song ${it+1}").save() }
    }
    def destroy = {
    }
}
