interface Playable {
    void play();
}

class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Guitar extends Instrument implements Playable {
    public Guitar() {
        super("Guitar");
    }

    @Override
    public void play() {
        System.out.println("Strumming the Guitar");
    }
}

class Piano extends Instrument implements Playable {
    public Piano() {
        super("Piano");
    }

    @Override
    public void play() {
        System.out.println("Playing the Piano");
    }
}

class Drums extends Instrument implements Playable {
    public Drums() {
        super("Drums");
    }

    @Override
    public void play() {
        System.out.println("Beating the Drums");
    }
}

class Violin extends Instrument {
    public Violin() {
        super("Violin");
    }
}

class MusicStore {
    public void showcase(Instrument instrument) {
        System.out.println("Instrument: " + instrument);

        if (instrument instanceof Playable) {
            Playable playableInstrument = (Playable) instrument;
            playableInstrument.play();
        } else {
            System.out.println("This instrument is not playable.");
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drums drums = new Drums();
        Violin violin = new Violin();

        MusicStore store = new MusicStore();

        store.showcase(guitar);
        store.showcase(piano);
        store.showcase(drums);
        store.showcase(violin);
    }
}