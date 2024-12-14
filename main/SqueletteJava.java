// Module pour la transcription des paroles en texte
public class TranscriptionModule {
    public String transcrireParole(String audioInput) {
        // Code pour convertir audio en texte
        // Exemple simple, à compléter avec une API de reconnaissance vocale
        return "Texte transcrit de l'audio : " + audioInput;
    }
}

// Module de détection des appels spécifiques à l'utilisateur malentendant
public class AlertModule {
    public void afficherAlerte(String message) {
        // Code pour afficher une alerte visuelle à l'utilisateur
        // Cela pourrait être un popup ou un changement de couleur de texte
        System.out.println("Alerte: " + message);
    }
}

// Interface utilisateur pour afficher les informations à l'utilisateur
public class UserInterface {
    private TranscriptionModule transcriptionModule;
    private AlertModule alertModule;

    public UserInterface() {
        transcriptionModule = new TranscriptionModule();
        alertModule = new AlertModule();
    }

    // Méthode pour afficher la transcription en temps réel
    public void afficherTranscription(String audioInput) {
        String texteTranscrit = transcriptionModule.transcrireParole(audioInput);
        System.out.println("Transcription en temps réel : " + texteTranscrit);
    }

    // Méthode pour afficher une alerte visuelle si quelqu'un s'adresse à l'utilisateur
    public void notifierAppelUtilisateur() {
        alertModule.afficherAlerte("Quelqu'un s'adresse à vous !");
    }

    // Méthode pour afficher une alerte pour des bruits spécifiques
    public void notifierBruit(String bruit) {
        alertModule.afficherAlerte("Bruit détecté : " + bruit);
    }
}
// Module pour la détection des bruits dans l'environnement
public class SoundDetectionModule {
    public String detecterBruit(String inputAudio) {
        // Code pour analyser l'audio et détecter des bruits spécifiques
        // Exemple simple : détecter un bruit de cloche
        if (inputAudio.contains("alarme")) {
            return "Alarme";
        } else if (inputAudio.contains("appel")) {
            return "Appel de nom";
        } else {
            return "Bruit non détecté";
        }
    }
}

// Classe principale pour simuler l'utilisation du système
public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        SoundDetectionModule soundDetectionModule = new SoundDetectionModule();

        // Simulation de transcription en temps réel
        userInterface.afficherTranscription("Bonjour, comment ça va ?");

        // Simulation de l'appel de l'utilisateur malentendant
        userInterface.notifierAppelUtilisateur();

        // Simulation de la détection d'un bruit dans l'environnement
        String bruitDetecte = soundDetectionModule.detecterBruit("alarme");
        userInterface.notifierBruit(bruitDetecte);
    }
}
