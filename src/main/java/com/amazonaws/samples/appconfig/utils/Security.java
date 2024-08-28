//javax.security.cert to java.security.cert classes migration
package com.amazonaws.samples.appconfig.utils;

import java.security.cert.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

public class Security {
    public Certificate getCertificate(File certFile) throws CertificateExpiredException, CertificateNotYetValidException {
        java.security.cert.X509Certificate cert = null;
        try {
            InputStream inStream = new FileInputStream(certFile);
            cert = X509Certificate.getInstance(inStream);
        } catch (java.security.cert.CertificateException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        cert.checkValidity(new Date());
        return cert;
    }

}
