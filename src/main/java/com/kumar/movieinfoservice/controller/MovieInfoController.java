/**
 * 
 */
package com.kumar.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.movieinfoservice.model.MovieItem;

/**
 * @author kumhosur
 *
 */
@RestController
@RequestMapping("/movieinfo")
public class MovieInfoController {
	
	@RequestMapping("/{movieId}")
	public MovieItem getMovie(@PathVariable String movieId) {
		return new MovieItem(movieId, "This is movie description");
				
	}

}
