**1) Cas d'utilisation :**

Malentendant :
C’est l’utilisateur principal du système. Il souhaite :
- Voir la transcription des paroles.
- Recevoir des alertes pour des événements spécifiques (bruit ambiant ou appel).
## Orateur (acteur secondaire) :
C’est une personne qui parle et dont le discours est transcrit. Il interagit indirectement avec le système, mais son rôle est essentiel pour déclencher la transcription.

Le malentendant a besoin de suivre la conversation en cours. Ce besoin est représenté par le cas d’utilisation "Voir la transcription".
Ce cas est directement lié au cas "Transcrire orateur", car sans transcription des paroles, il n’y a rien à afficher.
Une relation « include » est utilisée. Cela signifie que le cas "Voir la transcription" inclut obligatoirement le cas "Transcrire orateur".

Le malentendant doit être informé lorsqu’un événement particulier se produit, comme un bruit ambiant (alarme, signal) ou un appel de nom. Ce besoin est représenté par le cas d’utilisation "Être alerté".
Une relation « extends » est utilisée entre "Être alerté" et "Bruit ambiant + appel nom".
Pourquoi "extends" ?
Le cas "Bruit ambiant + appel nom" est une extension de "Être alerté". Cela signifie que ce cas est optionnel et représente une situation plus spécifique dans laquelle un bruit particulier (comme une alarme ou un appel) déclenche l’alerte.

**2) Séquence : **


**3) Etats-transitions :**

**4) Classe :**

Classes :
UserInterface : Classe centrale qui coordonne la transcription, les alertes, et les notifications sonores pour l'utilisateur.
TranscriptionModule : Convertit l'audio en texte, utilisé par UserInterface pour afficher des transcriptions.
AlertModule : Gère les alertes visuelles pour informer l'utilisateur, intégré dans UserInterface.
SoundDetectionModule : Détecte les bruits spécifiques et interagit temporairement avec UserInterface.

Agrégations :
UserInterface utilise TranscriptionModule et AlertModule comme composants permanents (1 à plusieurs instances possibles).

Dépendance :
UserInterface dépend temporairement de SoundDetectionModule (0 à 1 interaction avec 1 ou plusieurs modules).

**5) Activité :**
