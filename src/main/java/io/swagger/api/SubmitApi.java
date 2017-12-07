/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.model.SubmitRequest;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-06T10:43:47.052Z")

@Api(value = "submit", description = "the submit API")
public interface SubmitApi {

    @ApiOperation(value = "demande d inscription dans une formation", notes = "en entree les informations sur la formation et celle de l etudiant", response = Message.class, tags={ "formation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Message.class) })
    
    @RequestMapping(value = "/submit",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Message> submitPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SubmitRequest submitParam);

}
