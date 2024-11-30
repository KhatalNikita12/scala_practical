graph={'0':set(['1','2','3']),'1':set(['0','2']),'2':set(['0','1','4']),'3':set(['0']),'4':set(['2'])}
visited=set()
def dfs(visited,graph,node):
    if node not in visited:
        print(node)
        visited.add(node)
        for n in graph[node]:
            dfs(visited,graph,n)

            
dfs(visited,graph,'0')