import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class APCSProj extends JPanel {
    private boolean DEBUG = true;
    public  APCSProj() {
        super(new GridLayout(1,0));

        String[] columnNames = {"Pop",
                "Rock",
                "Hip Hop/Rap",
                "Indie",
                "EDM"};
        Object[][] data = {
                {"Upbeat", "Upbeat", "Upbeat", "Upbeat", "Upbeat"},
                {"Sad", "Sad", "Sad", "Sad", "Sad"},
                {"Chill", "Chill", "Chill", "Chill", "Chill"}
            };

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(700, 90));
        table.setFillsViewportHeight(true);

        table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    int row = table.rowAtPoint(evt.getPoint());
                    int col = table.columnAtPoint(evt.getPoint());
                    if (row == 0 && col == 0){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DWU13kKnk03AP");
                    }
                    if (row == 0 && col == 1){
                    System.out.println("Playlist: https://open.spotify.com/user/digster.fr/playlist/2esHfruMW8rAZI2DxQCNcj");
                    }
                    if (row == 0 && col == 2){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX0XUsuxWHRQd");
                    }
                    if (row == 0 && col == 3){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX2sUQwD7tbmL");
                    }
                    if (row == 0 && col == 4){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DWSf2RDTDayIx");
                    }
                    if (row == 1 && col == 0){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX3YSRoSdA634");
                    }
                    if (row == 1 && col == 1){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DWXs1L3AC0Xio");
                    }
                    if (row == 1 && col == 2){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DWT6MhXz0jw61");
                    }
                    if (row == 1 && col == 3){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DXbvABJXBIyiY");
                    }
                    if (row == 1 && col == 4){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DWTfrr8pte1rT");
                    }
                    if (row == 2 && col == 0){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DWTwnEm1IYyoj");
                    }
                    if (row == 2 && col == 1){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX6xOPeSOGone");
                    }
                    if (row == 2 && col == 2){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX7gIoKXt0gmx");
                    }
                    if (row == 1 && col == 3){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX6ALfRKlHn1t");
                    }
                    if (row == 2 && col == 4){
                    System.out.println("Playlist: https://open.spotify.com/user/spotify/playlist/37i9dQZF1DX6VdMW310YC7");
                    }
                }
            });

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }

    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("APCSProj");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        APCSProj newContentPane = new APCSProj();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}

