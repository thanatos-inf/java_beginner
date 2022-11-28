package HW3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class wave_algo {
    public static void main(String[] args) {
        var mg = new MapGenerator();
        System.out.println(
            new MapPrinter().MapColor(
                mg.getMap())
        );

        var lee = new WaveAlgo(mg.getMap());
        lee.Colorize(new makePoint(1, 1));

        System.out.println(
            new MapPrinter().rawData(
                mg.getMap())
        );
    }
}

class makePoint {
    int x, y;

    public makePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d y: %d", x, y);
    }
}

class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] map = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,},
            {-1, 0, 0, 0, 0, 0, 0, 0, -1, -1,},
            {-1, 0, 0, -1, -1, 0, 0, 0, -1, -1,},
            {-1, 0, 0, -1, 0, 0, 0, 0, 0, -1,},
            {-1, 0, -1, -1, 0, 0, 0, 0, 0, -1,},
            {-1, 0, 0, 0, 0, -1, -1, 0, 0, -1,},
            {-1, 0, 0, 0, 0, -1, 0, -1, 0, -1,},
            {-1, 0, 0, -1, -1, -1, -1, -1, 0, -1,},
            {-1, 0, 0, 0, 0, 0, 0, 0, 0, -1,},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,}
        };

        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }

    public void setStart(makePoint pos) {
        map[pos.x][pos.y] = -2;
    }

    public void setFinish(makePoint pos) {
        map[pos.x][pos.y] = - 3;
    }
}

class MapPrinter {
    public MapPrinter () {
    }

    public String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                sb.append(String.format("%5d", map[row][column]));
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }

    public String MapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                switch (map[row][column]) {
                    case 0:
                        sb.append("░");
                        break;
                    case -1:
                        sb.append("█");
                        break;
                    case -2:
                        sb.append("╳");
                        break;
                    case -3:
                        sb.append("╬");
                        break;
                    default:
                        break;
                }
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }
}

class WaveAlgo {
    int[][] map;
  
    public WaveAlgo(int[][] map) {
      this.map = map;
    }
  
    public void Colorize(makePoint startPoint) {
      Queue<makePoint> queue = new LinkedList<makePoint>();
      queue.add(startPoint);
      map[startPoint.x][startPoint.y] = 1;
  
      while (queue.size() != 0) {
        makePoint p = queue.remove();
  
        if (map[p.x - 1][p.y] == 0) {
          queue.add(new makePoint(p.x - 1, p.y));
          map[p.x - 1][p.y] = map[p.x][p.y] + 1;
        }
        if (map[p.x][p.y - 1] == 0) {
          queue.add(new makePoint(p.x, p.y - 1));
          map[p.x][p.y - 1] = map[p.x][p.y] + 1;
        }
        if (map[p.x + 1][p.y] == 0) {
          queue.add(new makePoint(p.x + 1, p.y));
          map[p.x + 1][p.y] = map[p.x][p.y] + 1;
        }
        if (map[p.x][p.y + 1] == 0) {
          queue.add(new makePoint(p.x, p.y + 1));
          map[p.x][p.y + 1] = map[p.x][p.y] + 1;
        }
      }
    }
  
    public ArrayList<makePoint> getPath(makePoint exit) {
      ArrayList<makePoint> road = new ArrayList<>();
      return road;
    }
}

