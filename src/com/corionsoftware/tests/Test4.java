package com.corionsoftware.tests;

import java.util.Scanner;

public class Test4 {

    public Test4() {
        this.perform();
    }

    public void perform() {
        System.out.println("Bitte gebe deinen Namen als String ein!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int nameLength = name.length();
        System.out.println("");
        for(int x = 0; x < nameLength; x++) {
            this.performMagic(name.toUpperCase(), x);
        }
    }

    public void performMagic(String name, int x) {
        if (name.charAt(x) == 'A')
        {
            System.out.println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'B')
        {
            System.out.println("..######..\n..#....#..\n..#####...\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'C')
        {
            System.out.println("..######..\n..#.......\n..#.......\n..#.......\n..######..\n");
        }

        else if (name.charAt(x) == 'D')
        {
            System.out.println("..#####...\n..#....#..\n..#....#..\n..#....#..\n..#####...\n");
        }

        else if (name.charAt(x) == 'E')
        {
            System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..######..\n");
        }

        else if (name.charAt(x) == 'F')
        {
            System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..#.......\n");
        }

        else if (name.charAt(x) == 'G')
        {
            System.out.println("..######..\n..#.......\n..#.####..\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'H')
        {
            System.out.println("..#....#..\n..#....#..\n..######..\n..#....#..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'I')
        {
            System.out.println("..######..\n....##....\n....##....\n....##....\n..######..\n");
        }

        else if (name.charAt(x) == 'J')
        {
            System.out.println("..######..\n....##....\n....##....\n..#.##....\n..####....\n");
        }

        else if (name.charAt(x) == 'K')
        {
            System.out.println("..#...#...\n..#..#....\n..##......\n..#..#....\n..#...#...\n");
        }

        else if (name.charAt(x) == 'L')
        {
            System.out.println("..#.......\n..#.......\n..#.......\n..#.......\n..######..\n");
        }

        else if (name.charAt(x) == 'M')
        {
            System.out.println("..#....#..\n..##..##..\n..#.##.#..\n..#....#..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'N')
        {
            System.out.println("..#....#..\n..##...#..\n..#.#..#..\n..#..#.#..\n..#...##..\n");
        }

        else if (name.charAt(x) == 'O')
        {
            System.out.println("..######..\n..#....#..\n..#....#..\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'P')
        {
            System.out.println("..######..\n..#....#..\n..######..\n..#.......\n..#.......\n");
        }

        else if (name.charAt(x) == 'Q')
        {
            System.out.println("..######..\n..#....#..\n..#.#..#..\n..#..#.#..\n..######..\n");
        }

        else if (name.charAt(x) == 'R')
        {
            System.out.println("..######..\n..#....#..\n..#.##...\n..#...#...\n..#....#..\n");
        }

        else if (name.charAt(x) == 'S')
        {
            System.out.println("..######..\n..#.......\n..######..\n.......#..\n..######..\n");
        }

        else if (name.charAt(x) == 'T')
        {
            System.out.println("..######..\n....##....\n....##....\n....##....\n....##....\n");
        }

        else if (name.charAt(x) == 'U')
        {
            System.out.println("..#....#..\n..#....#..\n..#....#..\n..#....#..\n..######..\n");
        }

        else if (name.charAt(x) == 'V')
        {
            System.out.println("..#....#..\n..#....#..\n..#....#..\n...#..#...\n....##....\n");
        }

        else if (name.charAt(x) == 'W')
        {
            System.out.println("..#....#..\n..#....#..\n..#.##.#..\n..##..##..\n..#....#..\n");
        }

        else if (name.charAt(x) == 'X')
        {
            System.out.println("..#....#..\n...#..#...\n....##....\n...#..#...\n..#....#..\n");
        }

        else if (name.charAt(x) == 'Y')
        {
            System.out.println("..#....#..\n...#..#...\n....##....\n....##....\n....##....\n");
        }

        else if (name.charAt(x) == 'Z')
        {
            System.out.println("..######..\n......#...\n.....#....\n....#.....\n..######..\n");
        }

        else if (name.charAt(x) == '.')
        {
            System.out.println("----..----\n");
        }
    }

    private static void SmallAlphabetHolder(String name, int x)
    {
        if (name.charAt(x) == 'a')
        {
            System.out.println("...#####..\n.......#..\n...#####..\n..#....#..\n...#####..\n");
        }

        else if (name.charAt(x) == 'b')
        {
            System.out.println("..#.......\n..#.......\n..#####...\n..#....#..\n..#####...\n");
        }

        else if (name.charAt(x) == 'c')
        {
            System.out.println("...####...\n..#....#..\n..#.......\n..#....#..\n...####...\n");
        }

        else if (name.charAt(x) == 'd')
        {
            System.out.println(".......#..\n.......#..\n...#####..\n..#....#..\n...#####..\n");
        }

        else if (name.charAt(x) == 'e')
        {
            System.out.println("...####...\n..#....#..\n..#####...\n..#.......\n...####...\n");
        }

        else if (name.charAt(x) == 'f')
        {
            System.out.println("...####...\n...#......\n..####....\n...#......\n...#......\n");
        }

        else if (name.charAt(x) == 'g')
        {
            System.out.println("...####...\n..#....#..\n...####...\n......#...\n...####...\n");
        }

        else if (name.charAt(x) == 'h')
        {
            System.out.println("..#.......\n..#.......\n..#####...\n..#...#...\n..#...#...\n");
        }

        else if (name.charAt(x) == 'i')
        {
            System.out.println(".....*....\n.....#....\n.....#....\n.....#....\n.....#....\n");
        }

        else if (name.charAt(x) == 'j')
        {
            System.out.println(".....*....\n.....#....\n.....#....\n..#..#....\n...##.....\n");
        }

        else if (name.charAt(x) == 'k')
        {
            System.out.println("...#......\n...#.#....\n...##.....\n...#.#....\n...#..#...\n");
        }

        else if (name.charAt(x) == 'l')
        {
            System.out.println("....#.....\n....#.....\n....#.....\n....#.....\n...####...\n");
        }

        else if (name.charAt(x) == 'm')
        {
            System.out.println("..........\n...#.#....\n..#.#.#...\n..#...#...\n..#...#...\n");
        }

        else if (name.charAt(x) == 'n')
        {
            System.out.println("..........\n...###....\n..#...#...\n..#...#...\n..#...#...\n");
        }

        else if (name.charAt(x) == 'o')
        {
            System.out.println("....###...\n...#...#..\n...#...#..\n...#...#..\n....###...\n");
        }

        else if (name.charAt(x) == 'p')
        {
            System.out.println("...####...\n...#...#..\n...####...\n...#......\n...#......\n");
        }

        else if (name.charAt(x) == 'q')
        {
            System.out.println("...####...\n..#....#..\n...#####..\n.......##.\n.......#..\n");
        }

        else if (name.charAt(x) == 'r')
        {
            System.out.println("...#.#....\n...##.....\n...#......\n...#......\n...#......\n");
        }

        else if (name.charAt(x) == 's')
        {
            System.out.println("..######..\n..#.......\n..######..\n.......#..\n..######..\n");
        }

        else if (name.charAt(x) == 't')
        {
            System.out.println("....#.....\n...####...\n....#.....\n....#.#...\n.....#....\n");
        }

        else if (name.charAt(x) == 'u')
        {
            System.out.println("..........\n...#...#..\n...#...#..\n...#...#..\n....###...\n");
        }

        else if (name.charAt(x) == 'v')
        {
            System.out.println("..........\n...#...#..\n...#...#..\n....#.#...\n.....#....\n");
        }

        else if (name.charAt(x) == 'w')
        {
            System.out.println("..........\n..#...#...\n..#...#...\n..#.#.#...\n...#.#....");
        }

        else if (name.charAt(x) == 'x')
        {
            System.out.println("..........\n....#.#...\n.....#....\n....#.#...\n..........\n");
        }

        else if (name.charAt(x) == 'y')
        {
            System.out.println("..........\n....#.#...\n....#.#...\n.....#....\n.....#....\n");
        }

        else if (name.charAt(x) == 'z')
        {
            System.out.println("..........\n...####...\n.....#....\n....#.....\n...####...\n");
        }
    }
}
