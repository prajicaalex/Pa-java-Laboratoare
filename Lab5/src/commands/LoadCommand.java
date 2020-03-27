/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;


import exceptions.InvalidPath;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author calan
 */
public class LoadCommand {
   
    public static void execute(String pathCatalog) throws InvalidPath
	{      
                Path path = Paths.get(pathCatalog);
                if(!Files.exists(path)) throw new InvalidPath(pathCatalog);
                try (Stream<String> lines = Files.lines(path)) {
                lines.forEachOrdered(line->System.out.println(line));
                } catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
                }
 }
}