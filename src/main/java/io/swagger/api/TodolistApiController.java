package io.swagger.api;

import io.swagger.model.ArrayTodolist;
import io.swagger.model.CreateOrUpdateTodolist;
import io.swagger.model.InlineResponse200;
import io.swagger.model.Todolist;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-29T01:47:25.669195809Z[GMT]")
@RestController
public class TodolistApiController implements TodolistApi {

    private static final Logger log = LoggerFactory.getLogger(TodolistApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TodolistApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ArrayTodolist> todolistGet(@Parameter(in = ParameterIn.QUERY, description = "Is include done todolist" ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "include_done", required = false, defaultValue="false") Boolean includeDone,@Size(min=1,max=100) @Parameter(in = ParameterIn.QUERY, description = "Filter todolist by name" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ArrayTodolist>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"priority\" : 0.8008281904610115,\n  \"tags\" : [ \"tags\", \"tags\" ]\n}, {\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"priority\" : 0.8008281904610115,\n  \"tags\" : [ \"tags\", \"tags\" ]\n} ]", ArrayTodolist.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ArrayTodolist>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ArrayTodolist>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Todolist> todolistPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateOrUpdateTodolist body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Todolist>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"priority\" : 0.8008281904610115,\n  \"tags\" : [ \"tags\", \"tags\" ]\n}", Todolist.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Todolist>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Todolist>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> todolistTodolistIdDelete(@Size(min=1,max=100) @Parameter(in = ParameterIn.PATH, description = "Todolist id for updated", required=true, schema=@Schema()) @PathVariable("todolistId") String todolistId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"success\" : true\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Todolist> todolistTodolistIdPut(@Size(min=1,max=100) @Parameter(in = ParameterIn.PATH, description = "Todolist id for updated", required=true, schema=@Schema()) @PathVariable("todolistId") String todolistId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody CreateOrUpdateTodolist body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Todolist>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"priority\" : 0.8008281904610115,\n  \"tags\" : [ \"tags\", \"tags\" ]\n}", Todolist.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Todolist>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Todolist>(HttpStatus.NOT_IMPLEMENTED);
    }

}
