package view.data;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Data {
    public static String idClicked = "Selectioner un Scooter";
    public static String modelClicked = "Selectioner un scooter";
    public static String kiloClicked = "Selectioner un scooter";

    // Create PropertyChangeSupport instance
    private static PropertyChangeSupport pcs = new PropertyChangeSupport(Data.class);

    public static void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public static void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    public static void setIdClicked(String newId) {
        String oldId = idClicked;
        idClicked = newId;
        // Fire property change event
        pcs.firePropertyChange("idClicked", oldId, newId);
    }

    public static void setModelClicked(String newModel) {
        String oldModel = modelClicked;
        modelClicked = newModel;
        // Fire property change event
        pcs.firePropertyChange("modelClicked", oldModel, newModel);
    }

    public static void setKiloClicked(String newKilo) {
        String oldKilo = kiloClicked;
        kiloClicked = newKilo;
        // Fire property change event
        pcs.firePropertyChange("kiloClicked", oldKilo, newKilo);
    }
}

