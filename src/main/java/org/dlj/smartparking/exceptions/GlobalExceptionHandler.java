package org.dlj.smartparking.exceptions;

import org.dlj.smartparking.rest.entity.ApiError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.util.WebUtils;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class}) //TODO don't use Exception class
    public final ResponseEntity<ApiError> handleException(final Exception ex, final WebRequest request) {
        final HttpHeaders headers = new HttpHeaders();
        final HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        return handleExceptionInternal(ex, null, headers, status, request);
    }

    private ResponseEntity<ApiError> handleExceptionInternal(
            final Exception ex,
            final ApiError body,
            final HttpHeaders headers,
            final HttpStatus status,
            final WebRequest request
    ) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }

        return new ResponseEntity<>(body, headers, status);
    }
}
