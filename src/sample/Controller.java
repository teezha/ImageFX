package sample;

/** ==============================================================================
 * File         : some_file.java
 *
 * Current Author: Robert Hewlett
 *
 * Previous Author: None
 *
 * Contact Info: somebody@somewhere.com
 *
 * Purpose :
 *
 * Dependencies: None
 *
 * Modification Log :
 *    --> Created MMM-DD-YYYY (fl)
 *    --> Updated MMM-DD-YYYY (fl)
 *
 * =============================================================================
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/** ===========================================================
 * The following block does ....
 * ===========================================================
 */


public class Controller {

    @FXML
    private Button bt26;

    @FXML
    private Button bt96;

    @FXML
    private Button bt101;

    @FXML
    private Label lblPic;

    @FXML
    void d101(ActionEvent event) {
        String file = "FILE:H:\\var\\gist\\7132\\m07_data\\images\\101.jpg";
        lblPic.setGraphic(new ImageView(new Image(file)));

    }

    /** ===========================================================
     * The following block does ....
     * ===========================================================
     */


    @FXML
    void d26(ActionEvent event) {

        String file = "FILE:H:\\var\\gist\\7132\\m07_data\\images\\26.jpg";
        lblPic.setGraphic(new ImageView(new Image(file)));
    }

    /** ===========================================================
     * The following block does ....
     * ===========================================================
     */


    @FXML
    void d96(ActionEvent event) {

        String file = "FILE:H:\\var\\gist\\7132\\m07_data\\images\\96.jpg";
        lblPic.setGraphic(new ImageView(new Image(file)));
    }

}
