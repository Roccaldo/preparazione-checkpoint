package co.develhope.preparazionecheckpoint.book;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    @Operation(summary = "Get list of Books", description = "This endpoint retrieves all the books.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "return the list of books"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Not found")
    })
    public ArrayList<Book> getBooks(@RequestBody ArrayList<Book> book) {
        return bookService.getBook(book);
    }

    @PostMapping("/addbook")
    @Operation(summary = "Add Book", description = "This endpoint adds a book to the list of books.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return the added book"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "404", description = "Not found")
    })
    public Book addBook(@RequestBody Book book) {
        return bookService.postBook(book);
    }
}
