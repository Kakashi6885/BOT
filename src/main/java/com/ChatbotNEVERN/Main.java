package com.ChatbotNEVERN;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Map;

public class Main extends ListenerAdapter {

    private static final String TOKEN = "MTI3MDAzNjQxMjAzMjYxNDUwMQ.GaTWme.xN2MsVu2dFvisuMgpf3GnyWch1BMuYrKiK1KGQ";

    private final Map<String, String> responses;
    private final Map<String, String> categories;

    public Main() {
        responses = new HashMap<>();
        categories = new HashMap<>();
        initializeResponses();
        initializeCategories();
    }

    private void initializeResponses() {
        // Allgemeine Chemie
        responses.put("h2o", "H2O ist die chemische Formel für Wasser, bestehend aus zwei Wasserstoffatomen und einem Sauerstoffatom.");
        responses.put("co2", "CO2 ist die chemische Formel für Kohlendioxid, ein farbloses Gas, das aus einem Kohlenstoffatom und zwei Sauerstoffatomen besteht.");
        responses.put("naoh", "NaOH ist die chemische Formel für Natriumhydroxid, auch als Ätznatron bekannt. Es ist eine starke Base, die in vielen industriellen Prozessen verwendet wird.");
        responses.put("ion", "Ein Ion ist ein elektrisch geladenes Atom oder Molekül, das durch den Verlust oder Gewinn von Elektronen entstanden ist.");
        responses.put("molekül", "Ein Molekül ist eine chemische Einheit, die aus zwei oder mehr Atomen besteht, die durch chemische Bindungen zusammengehalten werden.");
        responses.put("ammoniak", "Ammoniak ist eine chemische Verbindung aus Stickstoff und Wasserstoff mit der Formel NH3.");
        responses.put("elektron", "Ein Elektron ist ein subatomares Teilchen mit negativer Ladung, das die Elektronenhülle eines Atoms bildet.");
        responses.put("proton", "Ein Proton ist ein positiv geladenes subatomares Teilchen, das im Kern eines Atoms zu finden ist.");
        responses.put("neutron", "Ein Neutron ist ein subatomares Teilchen ohne elektrische Ladung, das ebenfalls im Kern eines Atoms zu finden ist.");
        responses.put("atom", "Ein Atom ist die kleinste Einheit eines chemischen Elements, die noch die Eigenschaften des Elements besitzt.");
        responses.put("chemische bindung", "Eine chemische Bindung ist die Wechselwirkung, die Atome in Molekülen zusammenhält.");
        responses.put("molekulare masse", "Die molekulare Masse ist die Summe der Massen aller Atome in einem Molekül.");
        responses.put("isotop", "Isotope sind Atome des gleichen Elements, die unterschiedliche Neutronenzahlen haben.");
        responses.put("elektronenkonfiguration", "Die Elektronenkonfiguration beschreibt die Verteilung der Elektronen auf die verschiedenen Orbitale eines Atoms.");
        responses.put("nobelgase", "Nobelgase sind eine Gruppe von Gasen, die in der letzten Gruppe des Periodensystems vorkommen und eine voll besetzte äußere Elektronenschale haben.");
        responses.put("edelmetalle", "Edelmetalle sind Metalle, die nicht leicht oxidieren oder korrodieren, wie Gold und Platin.");
        responses.put("allotrope", "Allotrope sind verschiedene Formen desselben Elements, die unterschiedliche physikalische Eigenschaften haben, wie Graphit und Diamant bei Kohlenstoff.");
        responses.put("solvatation", "Solvatation beschreibt den Prozess, bei dem Moleküle eines Lösungsmittels an gelöste Teilchen binden.");
        responses.put("reduktion", "Reduktion ist eine chemische Reaktion, bei der ein Atom oder Molekül Elektronen aufnimmt.");
        responses.put("oxidation", "Oxidation ist eine chemische Reaktion, bei der ein Atom oder Molekül Elektronen abgibt.");

        // Verbindungen
        responses.put("ionenbindung", "Eine Ionenbindung ist eine chemische Bindung, die durch die elektrostatische Anziehung zwischen positiv und negativ geladenen Ionen entsteht.");
        responses.put("kovalente bindung", "Eine kovalente Bindung ist eine chemische Bindung, bei der zwei Atome Elektronenpaare teilen, um ihre äusseren Elektronenschalen zu vervollständigen.");
        responses.put("metallbindung", "Eine Metallbindung ist eine chemische Bindung, bei der Elektronen frei durch das Metallgitter bewegen können und positive Metallionen zusammenhalten.");
        responses.put("wasserstoffbrückenbindung", "Eine Wasserstoffbrückenbindung ist eine schwache Bindung zwischen einem Wasserstoffatom, das kovalent an ein elektronegatives Atom gebunden ist, und einem anderen elektronegativen Atom.");
        responses.put("polare bindung", "Eine polare Bindung ist eine kovalente Bindung, bei der die Elektronen ungleich zwischen den Atomen verteilt sind, was zu einer elektrischen Dipolbildung führt.");
        responses.put("unpolare bindung", "Eine unpolare Bindung ist eine kovalente Bindung, bei der die Elektronen gleichmässig zwischen den Atomen verteilt sind.");
        responses.put("komplexverbindung", "Eine Komplexverbindung ist eine chemische Verbindung, die aus einem Zentralatom oder Zentralion und mehreren Liganden besteht, die an dieses Zentralatom gebunden sind.");
        responses.put("salz", "Ein Salz ist eine ionische Verbindung, die entsteht, wenn eine Säure und eine Base miteinander reagieren.");
        responses.put("ester", "Ein Ester ist eine chemische Verbindung, die durch die Reaktion einer Säure mit einem Alkohol entsteht und oft fruchtige Gerüche hat.");
        responses.put("etherbindung", "Eine Etherbindung ist eine chemische Bindung zwischen zwei Kohlenstoffatomen, die durch ein Sauerstoffatom verbunden sind.");
        responses.put("organische verbindung", "Organische Verbindungen enthalten Kohlenstoff und sind oft auch an Wasserstoff gebunden.");
        responses.put("anorganische verbindung", "Anorganische Verbindungen enthalten in der Regel keinen Kohlenstoff-Wasserstoff-Bindungen, wie z.B. Salze und Mineralien.");
        responses.put("peptidbindung", "Eine Peptidbindung ist die chemische Bindung zwischen den Aminogruppen und Carboxylgruppen in Proteinen.");
        responses.put("sulfidbindung", "Eine Sulfidbindung ist eine chemische Bindung zwischen zwei Schwefelatomen oder einem Schwefel- und einem Metallatom.");
        responses.put("ammoniumsalz", "Ein Ammoniumsalz ist ein Salz, das Ammoniumionen (NH4+) enthält.");
        responses.put("phasenübergang", "Ein Phasenübergang ist der Wechsel eines Stoffes von einem Aggregatzustand in einen anderen, z.B. von fest zu flüssig.");

        // Säuren und Basen
        responses.put("säure", "Eine Säure ist eine Substanz, die in der Lage ist, Protonen (H+) abzugeben und hat in wässriger Lösung einen pH-Wert unter 7.");
        responses.put("base", "Eine Base ist eine Substanz, die Protonen (H+) aufnehmen kann oder Hydroxidionen (OH-) in Lösung freisetzt und hat einen pH-Wert über 7.");
        responses.put("ph", "pH ist ein Mass für die Wasserstoffionenkonzentration einer Lösung und zeigt an, wie sauer oder basisch die Lösung ist.");
        responses.put("neutralisation", "Neutralisation ist eine chemische Reaktion, bei der eine Säure und eine Base zu Salz und Wasser reagieren.");
        responses.put("indikator", "Ein Indikator ist eine Substanz, die durch Farbanderung den pH-Wert einer Lösung anzeigen kann.");
        responses.put("essigsäure", "Essigsäure ist eine organische Säure mit der chemischen Formel CH3COOH, die in Essig vorkommt.");
        responses.put("pufferlösung", "Eine Pufferlösung ist eine spezielle Art von Lösung, die den pH-Wert bei Zugabe von Säuren oder Basen relativ konstant hält.");
        responses.put("käfer", "Käfer sind eine Gruppe von organischen Verbindungen, die sowohl saure als auch basische Eigenschaften zeigen können, wie Ammoniumchlorid.");
        responses.put("carbonat", "Carbonate sind Salze oder Ester der Kohlensäure, die das Carbonation (CO3^2-) enthalten.");
        responses.put("ammonium", "Ammonium ist ein positiv geladenes Ion (NH4^+), das in Ammoniumverbindungen vorkommt.");
        responses.put("laugen", "Laugen sind wässrige Lösungen von Basen, die Hydroxidionen enthalten und einen pH-Wert über 7 haben.");
        responses.put("salzsäure", "Salzsäure ist eine starke Säure mit der chemischen Formel HCl, die in Magensäure vorkommt.");
        responses.put("ammoniaklösung", "Ammoniaklösung ist eine wässrige Lösung von Ammoniak, die basische Eigenschaften hat.");
        responses.put("ph-skala", "Die pH-Skala reicht von 0 bis 14 und misst die Säure- oder Basenstärke einer Lösung.");
        responses.put("reduktion senken", "Reduktion ist der Prozess, bei dem ein Stoff Elektronen aufnimmt und dadurch seine Oxidationsstufe senkt.");
        responses.put("oxidationsstuffe", "Oxidation ist der Prozess, bei dem ein Stoff Elektronen abgibt und dadurch seine Oxidationsstufe erhöht.");
        responses.put("hydroxidion", "Ein Hydroxidion (OH-) ist ein negativ geladenes Ion, das in Basenlösungen vorkommt.");
        responses.put("salzbildung", "Salzbildung erfolgt bei der Neutralisation einer Säure durch eine Base.");
        responses.put("pufferkapazität", "Die Pufferkapazität ist die Fähigkeit einer Pufferlösung, den pH-Wert stabil zu halten.");

        // Periodensystem
        responses.put("periodensystem", "Das Periodensystem wurde 1869 von dem russischen Chemiker Dmitri Mendelejew entwickelt.");
        responses.put("elemente", "Im Periodensystem gibt es derzeit 118 bekannte Elemente.");
        responses.put("molare masse von wasser", "Die molare Masse von Wasser (H2O) beträgt etwa 18 g/mol.");
        responses.put("edelgase", "Edelgase sind eine Gruppe von Elementen im Periodensystem, die sehr reaktionsträg sind, darunter Helium, Neon und Argon.");
        responses.put("alkalimetalle", "Alkalimetalle sind eine Gruppe von Elementen im Periodensystem, die sehr reaktionsfreudig sind, darunter Lithium, Natrium und Kalium.");
        responses.put("halbmetalle", "Halbmetalle sind Elemente, die Eigenschaften sowohl von Metallen als auch von Nichtmetallen aufweisen, wie Silizium und Arsen.");
        responses.put("lanthanoide", "Lanthanoide sind eine Gruppe von 15 Elementen im Periodensystem von Lanthan bis Lutetium, die ähnliche chemische Eigenschaften haben.");
        responses.put("actinoide", "Actinoide sind eine Gruppe von Elementen im Periodensystem von Actinium bis Lawrencium, die radioaktive Eigenschaften aufweisen.");
        responses.put("vorhersage von mendelejew", "Mendelejew sagte die Existenz und Eigenschaften von Elementen voraus, die noch nicht entdeckt waren.");
        responses.put("wichtige gruppe im periodensystem", "Die Halogene sind eine wichtige Gruppe im Periodensystem, die sehr reaktive nichtmetallische Elemente wie Fluor und Chlor umfasst.");
        responses.put("kernladung", "Die Kernladung eines Elements entspricht der Anzahl der Protonen im Atomkern und bestimmt die Ordnungszahl des Elements.");
        responses.put("verschiebung der elemente", "Die Position der Elemente im Periodensystem basiert auf ihrer elektronischen Konfiguration und ihrer chemischen Eigenschaften.");
        responses.put("silizium", "Silizium ist ein Halbmetall, das in der Gruppe 14 des Periodensystems steht und für die Herstellung von Halbleitern verwendet wird.");
        responses.put("periodenwechsel", "Der Wechsel von Perioden im Periodensystem spiegelt die Zunahme der Elektronenschalen wider.");
        responses.put("ionenradius", "Der Ionenradius ist der Radius eines Ions und variiert je nach Ladung und Umgebung.");
        responses.put("oxidationszustand", "Der Oxidationszustand eines Elements beschreibt die Anzahl der Elektronen, die ein Atom bei der Bindung mit anderen Atomen verliert oder gewinnt.");
        responses.put("kristallstruktur", "Die Kristallstruktur beschreibt die räumliche Anordnung der Atome in einem Kristall.");
        responses.put("schalenmodell", "Das Schalenmodell beschreibt die Elektronenanordnung um den Atomkern in verschiedenen Energiestufen oder Schalen.");
        responses.put("metallische bindung", "Metallische Bindung ist die Art der Bindung in Metallen, bei der Elektronen frei im Metallgitter bewegen.");
        responses.put("radioaktive elemente", "Radioaktive Elemente sind solche, die spontane Strahlung abgeben, wie Uran und Radon.");

        // Stöchiometrie
        responses.put("molekulare formel", "Die molekulare Formel zeigt die genaue Anzahl der Atome jeder Art in einem Molekül an.");
        responses.put("mol", "Ein Mol ist eine Einheit der Stoffmenge in der Chemie, die 6,022 x 10^23 Teilchen (Atome, Moleküle, Ionen) entspricht.");
        responses.put("gesetz der erhaltung der masse", "Das Gesetz der Erhaltung der Masse besagt, dass die Gesamtmasse der Reaktanten gleich der Gesamtmasse der Produkte in einer chemischen Reaktion ist.");
        responses.put("stöchiometrie", "Stöchiometrie ist der Bereich der Chemie, der sich mit den quantitativen Beziehungen zwischen den Reaktanten und Produkten in einer chemischen Reaktion befasst.");
        responses.put("ausbeute", "Die Ausbeute einer chemischen Reaktion ist die Menge des Produkts, die tatsächlich gewonnen wird, im Verhältnis zur theoretisch möglichen Menge.");
        responses.put("limitierendes reaktant", "Das limitierende Reaktant ist das Reaktant, das in einer chemischen Reaktion vollständig verbraucht wird und dadurch die maximale Menge an Produkt bestimmt.");
        responses.put("massenprozent", "Massenprozent ist ein Maß für den Anteil eines bestimmten Stoffes an der Gesamtmasse einer Mischung oder Lösung.");
        responses.put("verhältnisformel", "Eine Verhältnisformel gibt das einfachste ganze Zahlenverhältnis der Atome in einer chemischen Verbindung an.");
        responses.put("reaktionsgleichung", "Eine Reaktionsgleichung stellt die chemische Reaktion zwischen Reaktanten und Produkten in Form einer Gleichung dar.");
        responses.put("theoretische ausbeute", "Die theoretische Ausbeute ist die maximale Menge eines Produkts, die unter idealen Bedingungen in einer Reaktion erzielt werden kann.");
        responses.put("massenerhaltungsgesetz", "Das Massenerhaltungsgesetz besagt, dass die Gesamtmasse der Stoffe in einer chemischen Reaktion konstant bleibt.");
        responses.put("stoichiometrische verhältnisse", "Stoichiometrische Verhältnisse sind die Verhältnisse, in denen Reaktanten und Produkte in einer chemischen Reaktion zueinander stehen.");
        responses.put("ideale gasgesetz", "Das ideale Gasgesetz beschreibt das Verhalten von Gasen mit der Formel PV = nRT, wobei P der Druck, V das Volumen, n die Stoffmenge, R die Gaskonstante und T die Temperatur ist.");
        responses.put("molekulare massenbestimmung", "Die Bestimmung der molekularen Masse erfolgt durch die Messung der Masse eines Moleküls, oft mit Massenspektrometrie.");
        responses.put("empirische formel", "Die empirische Formel gibt das einfachste ganze Zahlenverhältnis der Atome in einer chemischen Verbindung an.");
        responses.put("kolligative eigenschaften", "Kolligative Eigenschaften sind Eigenschaften von Lösungen, die von der Anzahl der gelösten Teilchen abhängen, z.B. Siedepunktserhöhung und Gefrierpunktserniedrigung.");
        responses.put("gesamte stoffmenge", "Die gesamte Stoffmenge ist die Summe aller Stoffmengen der Reaktanten oder Produkte in einer chemischen Reaktion.");
        responses.put("prozentsatz der umwandlung", "Der Prozentsatz der Umwandlung gibt an, wie viel des Ausgangsstoffs in Produkt umgewandelt wurde.");
        responses.put("reaktionsenthalpie", "Die Reaktionsenthalpie ist die Wärmemenge, die bei einer chemischen Reaktion unter konstantem Druck frei wird oder aufgenommen wird.");

        // Reaktionsarten
        responses.put("verbrennung", "Eine Verbrennung ist eine chemische Reaktion, bei der ein Stoff mit Sauerstoff reagiert und dabei Wärme und Licht freisetzt.");
        responses.put("synthese", "Eine Synthese ist eine chemische Reaktion, bei der zwei oder mehr einfache Substanzen zu einer komplexeren Substanz reagieren.");
        responses.put("zersetzung", "Eine Zersetzung ist eine chemische Reaktion, bei der eine Verbindung in zwei oder mehr einfachere Substanzen zerlegt wird.");
        responses.put("doppelte austauschreaktion", "Eine doppelte Austauschreaktion ist eine chemische Reaktion, bei der die Ionen von zwei Verbindungen die Plätze tauschen und zwei neue Verbindungen bilden.");
        responses.put("neutralisationsreaktion", "Eine Neutralisationsreaktion ist eine chemische Reaktion zwischen einer Säure und einer Base, bei der Wasser und ein Salz entstehen.");
        responses.put("redoxreaktion", "Eine Redoxreaktion ist eine chemische Reaktion, bei der Elektronen von einem Reaktanten auf einen anderen übertragen werden.");
        responses.put("hydratisierung", "Hydratisierung ist der Prozess, bei dem Wassermoleküle an ein Ion oder Molekül gebunden werden.");
        responses.put("thermolyse", "Thermolyse ist eine Reaktion, bei der eine Verbindung durch Erhitzen in einfachere Substanzen zerlegt wird.");
        responses.put("katalyse", "Katalyse ist der Prozess, bei dem ein Katalysator die Geschwindigkeit einer chemischen Reaktion erhöht, ohne selbst verbraucht zu werden.");
        responses.put("saurereaktion", "Eine Säure-Reaktion ist eine Reaktion, bei der eine Säure mit einer Base reagiert und dabei ein Salz und Wasser bildet.");
        responses.put("exotherme reaktion", "Eine exotherme Reaktion ist eine chemische Reaktion, bei der Wärme freigesetzt wird.");
        responses.put("endotherme reaktion", "Eine endotherme Reaktion ist eine chemische Reaktion, bei der Wärme aufgenommen wird.");
        responses.put("komplexbildungsreaktion", "Eine Komplexbildungsreaktion ist eine chemische Reaktion, bei der ein Komplex mit einem zentralen Atom und Liganden gebildet wird.");
        responses.put("hydratisierung von salzen", "Die Hydratisierung von Salzen ist der Prozess, bei dem Wassermolekeule an Salzionen gebunden werden.");
        responses.put("thermodynamik", "Thermodynamik ist das Studium der Energieumwandlungen und Wärmeübertragungen in chemischen Reaktionen.");
        responses.put("bedeutung von katalysatoren", "Katalysatoren sind Substanzen, die die Reaktionsgeschwindigkeit erhöhen, ohne selbst verbraucht zu werden.");
        responses.put("reaktionsmechanismus", "Der Reaktionsmechanismus beschreibt die detaillierte Abfolge von Schritten, die in einer chemischen Reaktion ablaufen.");
        responses.put("chemisches gleichgewicht", "Chemisches Gleichgewicht ist der Zustand, bei dem die Konzentrationen der Reaktanten und Produkte in einer chemischen Reaktion konstant bleiben.");
        responses.put("reaktionskinetik", "Reaktionskinetik ist das Studium der Geschwindigkeit und der Mechanismen chemischer Reaktionen.");  


        responses.put("sinn des lebens","42 ist der sinn des lebens warum? IDK aber 42 ist es wieso überhaupt? idk bin nur ein bot");
        responses.put("hi","Hallo wie gehts?");
        responses.put("hallo","Hi _Naaaaaaahhhh wie gehts?_");
        responses.put("was kannst du?","ich bin ein Chatbot für Chemie. Erstellt von JoJo(Joshkao Kujo)");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        responses.put("","");
        


    }

    private void initializeCategories() {
        categories.put("allgemeine chemie", "Fragen zur Kategorie 'allgemeine chemie':\n- was ist h2o\n- was ist ammoniak\n- was ist naoh\n- was ist co2\n- was ist ein ion\n- was ist ein molekül\n- was ist ein elektron\n- was ist ein proton\n- was ist ein neutron\n- was ist ein atom\n- was ist eine chemische reaktion\n- was ist eine exotherme reaktion\n- was ist eine endotherme reaktion\n- was ist eine lösung\n- was ist ein gemisch\n- was ist ein reaktionsschema\n- was ist eine stöchiometrie\n- was ist eine molare masse\n- was ist ein salz\n- was ist ein ester\n- was ist ein hydrolyse");
        categories.put("verbindungen", "Fragen zur Kategorie 'verbindungen':\n- was ist eine ionenbindung\n- was ist eine kovalente bindung\n- was ist eine metallbindung\n- was ist eine wasserstoffbrückenbindung\n- was ist eine polare bindung\n- was ist eine unpolare bindung\n- was ist eine komplexverbindung\n- was ist ein salz\n- was ist ein ester\n- was ist eine etherbindung\n- was ist eine koordiniertbindung\n- was ist ein hydrid\n- was ist eine ionenbindung\n- was ist eine peptidbindung\n- was ist eine etherbindung\n- was ist eine organische verbindung\n- was ist eine anorganische verbindung\n- was ist ein chelatkomplex\n- was ist eine hydratisierung\n- was ist eine ligandenbindung\n- was ist eine dative bindung");
        categories.put("säuren und basen", "Fragen zur Kategorie 'säuren und basen':\n- was ist eine säure\n- was ist eine base\n- was ist ph\n- was ist neutralisation\n- was ist ein indikator\n- was ist essigsäure\n- was ist eine pufferlösung\n- was sind käfer\n- was ist eine salzsäure\n- was ist eine wässrige lösung\n- was ist eine konzentration\n- was ist eine säure-base-reaction\n- was ist eine stärke der säure\n- was ist ein basischer indikator\n- was ist der ph-wert von wasser\n- was ist der ph-wert von essig\n- was ist der ph-wert von amonium\n- was ist der ph-wert von natron\n- was ist der ph-wert von lauge\n- was ist der ph-wert von salzsäure");
        categories.put("periodensystem", "Fragen zur Kategorie 'periodensystem':\n- wer hat das periodensystem erstellt\n- wie viele elemente gibt es im periodensystem\n- was ist die molare masse von wasser\n- was sind edelgase\n- was sind alkalimetalle\n- was sind halbmetalle\n- was sind lanthanoide\n- was sind actinoide\n- was ist die kernladung\n- was ist die verschiebung der elemente\n- was ist ein ionenradius\n- was ist der oxidationszustand\n- was ist die kristallstruktur\n- was ist das schalenmodell\n- was ist eine metallische bindung\n- was sind radioaktive elemente\n- was ist die gruppennummer\n- was ist die periodennummer\n- was ist der unterschied zwischen metallen und nichtmetallen\n- wie berechnet man die molare masse");
        categories.put("stöchiometrie", "Fragen zur Kategorie 'stöchiometrie':\n- was ist die molekulare formel\n- was ist ein mol\n- was ist das gesetz der erhaltung der masse\n- was ist stöchiometrie\n- was ist die ausbeute\n- was ist ein limitierendes reaktant\n- was ist massenprozent\n- was ist eine verhältnisformel\n- was ist eine reaktionsgleichung\n- was ist die theoretische ausbeute\n- was sind stoichiometrische verhältnisse\n- was ist das ideale gasgesetz\n- was ist die molekulare massenbestimmung\n- was ist die empirische formel\n- was sind kolligative eigenschaften\n- was ist die gesamte stoffmenge\n- was ist der prozentsatz der umwandlung\n- was ist die reaktionsenthalpie\n- was ist der stoichiometrische köffizient\n- was ist der unterschied zwischen realem und idealem gas");
        categories.put("reaktionsarten", "Fragen zur Kategorie 'reaktionsarten':\n- was ist eine verbrennung\n- was ist eine synthese\n- was ist eine zersetzung\n- was ist eine doppelte austauschreaktion\n- was ist eine neutralisationsreaktion\n- was ist eine redoxreaktion\n- was ist hydratisierung\n- was ist thermolyse\n- was ist katalyse\n- was ist eine säurereaktion\n- was ist eine exotherme reaktion\n- was ist eine endotherme reaktion\n- was ist eine komplexbildungsreaktion\n- was ist die hydratisierung von salzen\n- was ist thermodynamik\n- was ist die bedeutung von katalysatoren\n- was ist der reaktionsmechanismus\n- was ist chemisches gleichgewicht\n- was ist reaktionskinetik\n- was ist eine dative bindung");

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw().toLowerCase();

        if (event.getAuthor().isBot()) return;

        if (message.equals("!help")) {
            String helpMessage = "Verfügbare Kategorien:\n";
            for (String category : categories.keySet()) {
                helpMessage += "- " + category + "\n";
            }
            event.getChannel().sendMessage(helpMessage).queue();
        } else if (categories.containsKey(message)) {
            event.getChannel().sendMessage(categories.get(message)).queue();
        } else {
            String response = findResponseForKeywords(message);
            event.getChannel().sendMessage(response).queue();
        }
    }

    private String findResponseForKeywords(String query) {
        for (Map.Entry<String, String> entry : responses.entrySet()) {
            if (query.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "Unbekannter Befehl. Bitte benutze !help, um die verfügbaren Kategorien zu sehen und die dazugehoerige Frage zu stellen.";
    }

    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault(TOKEN)
                .addEventListeners(new Main())
                .build();
        jda.awaitReady();
    }
}