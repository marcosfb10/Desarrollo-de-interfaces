package CP;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class Direccion {

    private int CodigoPostal;

    public static void setCodigoPostal(int cp) throws BadPostCodeException {
        if (cp < 10000 || cp > 99999) {
            throw new BadPostCodeException("El código debe tener al menos 5 dígitos");
        }
    }
}
