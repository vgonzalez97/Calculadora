package com.profile.test4.service.impl;

import com.profile.test4.service.TracerAPI;
import org.springframework.stereotype.Service;

/**
 * Implementación por defecto de {@link TracerAPI} - no es especialmente brillante, pero para la realización de la POC es más que de sobra.
 */
@Service("TraceAPI")
public class TracerImpl implements TracerAPI {

    /**
     * {@inheritDoc}
     */
    public <T> void trace( final T result ) {
        System.out.println( "result :: " + result.toString() );
    }

}
