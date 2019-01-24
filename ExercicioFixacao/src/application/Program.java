package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter file full path: ");
			String path = sc.nextLine();
			Map<Candidate,Integer> votes = new LinkedHashMap<>();
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {

				String line = br.readLine();
				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					int quantity = Integer.parseInt(fields[1]);
					Candidate ps = new Candidate(name);
					if (votes.containsKey(ps)) {
						int count = votes.get(ps);
						votes.put(ps, quantity + count);
					} else {
						votes.put(ps, quantity);
					}
					line = br.readLine();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			for (Candidate key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			sc.close();
	}
}
